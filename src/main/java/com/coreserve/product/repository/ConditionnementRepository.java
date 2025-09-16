package com.coreserve.product.repository;

import com.coreserve.product.modele.Conditionnement;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ConditionnementRepository extends JpaRepository<Conditionnement, Long> {
}
