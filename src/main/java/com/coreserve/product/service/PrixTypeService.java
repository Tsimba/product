package com.coreserve.product.service;

import com.coreserve.product.modele.PrixType;
import com.coreserve.product.repository.PrixTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PrixTypeService {

    @Autowired
    private final PrixTypeRepository prixTypeRepository;

    public List<PrixType> getAllPrixTypes(){
        return prixTypeRepository.findAll();
    }

    public PrixType getPrixTypeById(Long id){
        return prixTypeRepository.findById(id).orElse(null);
    }

    public PrixType savePrixType(PrixType prix){
        return prixTypeRepository.save(prix);
    }
    public void deletePrixTypeById(Long id){
        prixTypeRepository.deleteById(id);
    }
}
