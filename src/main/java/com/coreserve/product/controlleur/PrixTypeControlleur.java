package com.coreserve.product.controlleur;

import com.coreserve.product.dto.PrixTypeDto;
import com.coreserve.product.mappper.PrixTypeMapper;
import com.coreserve.product.modele.PrixType;
import com.coreserve.product.service.PrixTypeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path ="/v1/prixtype")
@RequiredArgsConstructor
@CommonsLog
public class PrixTypeControlleur {


    @Autowired
    private PrixTypeService prixTypeService;

    @Autowired
    private PrixTypeMapper prixTypeMapper;


    @GetMapping("/getall")
    public ResponseEntity<List<PrixTypeDto>> getAll(){
        return  ResponseEntity.ok(prixTypeMapper.prixListToDtoList(prixTypeService.getAllPrixTypes()));
    }

    @GetMapping("/getbyid")
    public ResponseEntity<PrixTypeDto> getPrixById(@RequestParam Long id){
        return ResponseEntity.ok(prixTypeMapper.prixToDto(prixTypeService.getPrixTypeById(id)));
    }

    @PostMapping(path = "/create")
    public ResponseEntity<PrixTypeDto> create(@RequestBody PrixTypeDto prixType){
        return ResponseEntity.ok(prixTypeMapper.prixToDto(prixTypeService.savePrixType(prixTypeMapper.dtoToPrix(prixType))));
    }

    @DeleteMapping("/delete")
    public void deletePrix(@RequestParam Long id){
        PrixType prix = prixTypeService.getPrixTypeById(id);
        if(prix != null){
            prixTypeService.deletePrixTypeById(prix.getId());
        }

    }
}
