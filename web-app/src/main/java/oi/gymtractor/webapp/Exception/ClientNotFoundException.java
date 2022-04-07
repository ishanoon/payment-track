package oi.gymtractor.webapp.Exception;

public class ClientNotFoundException extends RuntimeException{
    public ClientNotFoundException(long id){
        super("Could not find client " + id);
    }
}
