package oi.gymtractor.webapp.repository;

import oi.gymtractor.webapp.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client,Long> {

}
