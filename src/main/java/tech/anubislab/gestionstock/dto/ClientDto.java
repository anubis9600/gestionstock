package tech.anubislab.gestionstock.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ClientDto {

    private Integer id;

    private String nom;

    private String prenom;

    private AdresseDto adresse;

    private String urlImage;

    private String mail;

    private String numTel;

    @JsonIgnore
    private List<CommandeClientDto> commandeClients;
}
