package com.coreserve.product.controlleur;

import com.coreserve.product.dto.ConditionnementDto;
import com.coreserve.product.mappper.ConditionnementMapper;
import com.coreserve.product.modele.Conditionnement;
import com.coreserve.product.service.ConditionnementService;
import lombok.RequiredArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path ="/v1/conditionnement")
@RequiredArgsConstructor
@CommonsLog
public class ConditionnementControlleur {

    @Autowired
    ConditionnementService conditionnementService;

    @Autowired
    ConditionnementMapper conditionnementMapper;




    @GetMapping("/getall")
    public ResponseEntity<List<ConditionnementDto>> getAllConditionnement() {
        return  ResponseEntity.ok(conditionnementMapper.conditionnementListToDtoList(conditionnementService.getAllConditionnement()));
    }

    @GetMapping("/getbyid")
    public ResponseEntity<ConditionnementDto> getConditionnementById(@RequestParam Long id) {
        return  ResponseEntity.ok(conditionnementMapper.conditionnementToDto(conditionnementService.getConditionnementById(id)));
    }

    @PostMapping(path = "/create")
    public ResponseEntity<ConditionnementDto> createConditionnement(@RequestBody ConditionnementDto conditionnement) {
        return  ResponseEntity.ok(conditionnementMapper.conditionnementToDto(conditionnementService.createConditionnement(conditionnementMapper.dtoToConditionnement(conditionnement))));
    }

    @DeleteMapping("/delete")
    public void deleteConditionnement(@RequestParam Long id) {
        Conditionnement conditionnement =  conditionnementService.getConditionnementById(id);
        if (conditionnement != null) {
            conditionnementService.deleteConditionnementById(conditionnement.getId());
        }
    }
}
