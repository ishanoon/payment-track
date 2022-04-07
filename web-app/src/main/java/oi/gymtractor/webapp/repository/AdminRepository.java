package oi.gymtractor.webapp.repository;

import oi.gymtractor.webapp.models.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<Admin,Long> {
}
