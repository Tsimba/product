package com.coreserve.product.modele;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Entity
@Table(name = "fournisseur")
@Getter
@Setter
public class Fournisseur {
    @Id
    @Column(name = "frs_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "frs_name")
    private String name;

    @Column(name = "frs_code")
    private String code;

    @CreationTimestamp
    @Column(name = "creation_date", updatable = false)
    private Date creationDate;

    @Column(name = "last_modify_date")
    @LastModifiedDate
    @UpdateTimestamp
    private Date modifyDate;
}
