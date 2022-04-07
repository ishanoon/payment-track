package oi.gymtractor.webapp.models;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
@Data @NoArgsConstructor
public class Client {
    private  @Id @GeneratedValue long Id;
    private String name;
    private PaymentMode paymentMode;
    private LocalDate paymentDate;
    private Integer contact;
}
