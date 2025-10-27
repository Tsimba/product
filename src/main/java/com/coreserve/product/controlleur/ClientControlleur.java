package com.coreserve.product.controlleur;



import com.coreserve.product.dto.ClientDto;
import com.coreserve.product.mappper.ClientMapper;
import com.coreserve.product.modele.Client;
import com.coreserve.product.service.ClientService;
import lombok.RequiredArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/client")
@RequiredArgsConstructor
@CommonsLog
public class ClientControlleur {
    @Autowired
    private ClientService clientService;

    @Autowired
    private ClientMapper clientMapper;

    @GetMapping("/findall")
    public ResponseEntity<List<ClientDto>> getAllClients() {
        return ResponseEntity.ok(clientMapper.articleListToDtoList(clientService.findAll()));
    }

    @GetMapping("/getbyid")
    public ResponseEntity<ClientDto> getClientById(@RequestParam Long id) {
        return ResponseEntity.ok(clientMapper.articleToDto(clientService.findById(id)));
    }

    @PostMapping("/create")
    public ResponseEntity<ClientDto> createClient(@RequestBody ClientDto clientDto) {
        return  ResponseEntity.ok(clientMapper.articleToDto(clientService.save(clientMapper.dtoToArticle(clientDto))));
    }

    @DeleteMapping("/delete/{clientId}")
    public ResponseEntity<?> deleteClientById(@PathVariable("clientId") Long clientId) {
        Client client = clientService.findById(clientId);
        if(client != null) {
            clientService.delete(client);
        }

        return ResponseEntity.noContent().build();
    }

    @GetMapping("/search/name")
    ResponseEntity<List<ClientDto>> searchClientByName(@RequestParam String name) {
        return ResponseEntity.ok(clientMapper.articleListToDtoList(clientService.searchByName(name)));
    }


}
