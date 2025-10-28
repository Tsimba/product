package com.coreserve.product.repository;

import com.coreserve.product.modele.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {

    @Query("SELECT c FROM Client c WHERE LOWER(c.lastname) LIKE LOWER(CONCAT('%',:name, '%'))")
    List<Client> searchByName(@Param("name") String name);

}
