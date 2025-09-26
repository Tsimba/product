package com.coreserve.product.controlleur;

import com.coreserve.product.dto.FournisseurDto;
import com.coreserve.product.mappper.FournisseurMapper;
import com.coreserve.product.modele.Fournisseur;
import com.coreserve.product.service.FournisseurService;
import lombok.RequiredArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping(path ="/v1/fournisseur")
@RequiredArgsConstructor
@CommonsLog
public class FournisseurControlleur {

    @Autowired
    private FournisseurService fournisseurService;

    @Autowired
    private FournisseurMapper fournisseurMapper;

    @GetMapping("/getall")
    public ResponseEntity<List<FournisseurDto>> getAllArticles() {
        return  ResponseEntity.ok(fournisseurMapper.fournisseurListToDtoList(fournisseurService.getAllFournisseurs()));
    }

    @GetMapping("/getbyid")
    public ResponseEntity<FournisseurDto> getArticleById(@RequestParam Long id) {
        return  ResponseEntity.ok(fournisseurMapper.fournisseurToDto(fournisseurService.getFournisseursById(id)));
    }

    @PostMapping(path = "/create")
    public ResponseEntity<FournisseurDto> createArticle(@RequestBody FournisseurDto fournisseurDto) {
        Fournisseur fournisseur = fournisseurMapper.dtoToFournisseur(fournisseurDto);

        return  ResponseEntity.ok(fournisseurMapper.fournisseurToDto(fournisseurService.createFournisseurs(fournisseur)));
    }

    @DeleteMapping("/delete")
    public void deleteArticle(@RequestParam Long id) {
        Fournisseur fournisseur = fournisseurService.getFournisseursById(id);
        if(fournisseur != null) {
            fournisseurService.deleteFournisseurs(fournisseur);
        }
    }
}
