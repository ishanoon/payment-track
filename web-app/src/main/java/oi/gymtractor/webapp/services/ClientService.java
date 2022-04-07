package oi.gymtractor.webapp.services;

import oi.gymtractor.webapp.Exception.ClientNotFoundException;
import oi.gymtractor.webapp.models.Client;
import oi.gymtractor.webapp.repository.ClientRepository;

import java.util.List;

public class ClientService {
    private final ClientRepository clientRepository;

    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    List<Client> listAllClients(){
        return clientRepository.findAll();
    }

    Client addClient(Client client){
        return clientRepository.save(client);
    }

    Client getOneClientById(long id){
        return clientRepository.findById(id)
                .orElseThrow(()->
                    new ClientNotFoundException(id)
                );
    }

    Client updateClient(Client client, long id){
        return clientRepository.findById(id)
                .map( updateClient -> {
                    updateClient.setId(client.getId());
                    updateClient.setContact(client.getContact());
                    updateClient.setName(client.getName());
                    updateClient.setPaymentDate(client.getPaymentDate());
                    updateClient.setPaymentMode(client.getPaymentMode());
                    return clientRepository.save(updateClient);
                }).orElseGet(()->{
                    client.setId(id);
                    return clientRepository.save(client);
                });
    }

    void deleteClient(long id){
        clientRepository.deleteById(id);
    }


}
