package oi.gymtractor.webapp.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Admin {
    private @Id @GeneratedValue long Id;
    private String name;
    private RoleSet role;
    private String password;
}
