package com.coreserve.product.controlleur;

import com.coreserve.product.dto.PrixDto;
import com.coreserve.product.mappper.PrixMapper;
import com.coreserve.product.modele.Prix;
import com.coreserve.product.service.PrixService;
import lombok.RequiredArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path ="/v1/prix", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
@CommonsLog
public class PrixControlleur {

    @Autowired
    private PrixService prixService;

    @Autowired
    private PrixMapper prixMapper;

    @GetMapping("/getall")
    public ResponseEntity<List<PrixDto>> getAll(){
        return  ResponseEntity.ok(prixMapper.prixListToDtoList(prixService.getAllPrix()));
    }

    @GetMapping("/getbyid")
    public ResponseEntity<PrixDto> getById(@RequestParam Long id){
        return ResponseEntity.ok(prixMapper.prixToDto(prixService.getPrixById(id)));
    }

    @PostMapping(path = "/create")
    public ResponseEntity<PrixDto> create(@RequestBody PrixDto prixDto){
        return ResponseEntity.ok(prixMapper.prixToDto(prixService.savePrix(prixMapper.dtoToPrix(prixDto))));
    }

    @DeleteMapping("/delete")
    public void deletePrix(@RequestParam Long id){
        Prix prix = prixService.getPrixById(id);
        if(prix != null){
            prixService.deletePrixById(id);
        }

    }


}
