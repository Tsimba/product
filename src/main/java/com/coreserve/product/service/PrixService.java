package com.coreserve.product.service;

import com.coreserve.product.modele.Prix;
import com.coreserve.product.repository.PrixRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PrixService {

    @Autowired
    private final PrixRepository prixRepository;

    public List<Prix> getAllPrix(){
        return prixRepository.findAll();
    }

    public Prix getPrixById(Long id){
        return prixRepository.findById(id).orElse(null);
    }

    public Prix savePrix(Prix prix){
        return prixRepository.save(prix);
    }
    public void deletePrixById(Long id){
        prixRepository.deleteById(id);
    }
}
