package com.coreserve.product.modele;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Table(name = "user")
@Getter
@Setter
public class User {
    @Id
    @Column(name = "usr_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "usr_firstname")
    private String firstName;

    @Column(name = "usr_lastname")
    private String lastname;

    @Column(name = "usr_email")
    private String email;

    @Column(name = "usr_phone")
    private String phone;

    @CreationTimestamp
    @Column(name = "creation_date")
    private Date creationDate;

    @Column(name = "last_modify_date")
    private Date modifyDate;
}
