package com.example.microserviceclient.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClientResponseDTO {

    private String nom;
    private String ville;
    private String prenom;
    private int tele;
    private String email;


}
