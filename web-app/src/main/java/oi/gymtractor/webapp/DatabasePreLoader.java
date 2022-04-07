package oi.gymtractor.webapp;

import lombok.extern.slf4j.Slf4j;
import oi.gymtractor.webapp.models.Admin;
import oi.gymtractor.webapp.models.RoleSet;
import oi.gymtractor.webapp.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;

@Slf4j
@Configurable
public class DatabasePreLoader {
    @Bean
    CommandLineRunner initDatabase(AdminRepository adminRepository){
        return args -> {
            log.info(" Preloading " + adminRepository.save(new Admin(1,"instructure@k79.com", RoleSet.INSTRUCTOR,"admin")));
        };
    }
}
