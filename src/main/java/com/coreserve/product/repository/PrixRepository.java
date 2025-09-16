package com.coreserve.product.repository;

import com.coreserve.product.modele.Prix;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrixRepository extends JpaRepository<Prix, Long> {
}
