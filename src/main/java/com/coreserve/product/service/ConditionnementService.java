package com.coreserve.product.service;
import com.coreserve.product.modele.Conditionnement;
import com.coreserve.product.repository.ConditionnementRepository;
import com.coreserve.product.repository.FournisseurRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ConditionnementService {

    public static final Logger logger = LoggerFactory.getLogger(ConditionnementService.class);

    @Autowired
    private ConditionnementRepository conditionnementRepository;

    public List<Conditionnement> getAllConditionnement() {
        return conditionnementRepository.findAll();
    }

    public Conditionnement getConditionnementById(Long id) {
        return conditionnementRepository.findById(id).orElse(null);
    }

    public Conditionnement createConditionnement(Conditionnement conditionnement) {
        return conditionnementRepository.save(conditionnement);
    }

    public void deleteConditionnementById(Long id) {
        conditionnementRepository.deleteById(id);
    }
}
