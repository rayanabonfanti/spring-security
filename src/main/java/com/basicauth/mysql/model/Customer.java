package com.basicauth.mysql.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@Builder
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private Integer customerId;

    @Column(name = "customer_login", nullable = false)
    private String customerLogin;

    @Column(name = "customer_password", nullable = false)
    private String customerPassword;

    @Column(name = "customer_name", nullable = false)
    private String customerName;

}
