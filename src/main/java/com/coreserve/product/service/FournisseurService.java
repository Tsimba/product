package com.coreserve.product.service;

import com.coreserve.product.modele.Fournisseur;
import com.coreserve.product.repository.FournisseurRepository;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class FournisseurService {

    public static final Logger logger = LoggerFactory.getLogger(FournisseurService.class);

    @Autowired
    private FournisseurRepository fournisseurRepository;


    public List<Fournisseur> getAllFournisseurs() {
        return fournisseurRepository.findAll();
    }

    public  Fournisseur createFournisseurs(Fournisseur fournisseur) {
        return fournisseurRepository.save(fournisseur);
    }

    public Fournisseur getFournisseursById(Long id) {
        return fournisseurRepository.findById(id).orElse(null);
    }

    public void deleteFournisseurs(Fournisseur fournisseur) {
        fournisseurRepository.delete(fournisseur);
    }
}
