package com.example.microserviceclient.web;

import com.example.microserviceclient.dto.ClientRequestDTO;
import com.example.microserviceclient.dto.ClientResponseDTO;
import com.example.microserviceclient.entities.Client;
import com.example.microserviceclient.services.ClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api")
public class clientRestAPI {

    private ClientService clientService;

    public clientRestAPI(ClientService clientService) {

        this.clientService = clientService;
    }

    @GetMapping(path = "/clients")
    public List<ClientResponseDTO> allClients(){

        return clientService.listClients();
    }
    @PostMapping(path = "/add")
    public ClientResponseDTO save(@RequestBody  ClientRequestDTO clientRequestDTO) {
        return clientService.save(clientRequestDTO);
    }

    @GetMapping(path = "/clients/{id}")
    public ClientResponseDTO getClient(@PathVariable int id) {

        return clientService.getClient(id);
    }
}
