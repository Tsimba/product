package com.coreserve.product.modele;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table(name = "client")
@Getter
@Setter
public class Client {
    @Id
    @Column(name = "client_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "client_firstname")
    private String firstName;

    @Column(name = "client_lastname")
    private String lastname;

    @Column(name = "client_email")
    private String email;

    @Column(name = "client_phone")
    private String phone;

    @CreationTimestamp
    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "last_modify_date")
    private Date modifyDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "addr_id")
    private Addresse addresse;

}
