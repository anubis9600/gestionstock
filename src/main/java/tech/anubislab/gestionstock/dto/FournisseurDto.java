package tech.anubislab.gestionstock.dto;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Builder
@Data
public class FournisseurDto {

    private Integer id;
    
    private String nom;

    private String prenom;

    private AdresseDto adresse;

    private String urlImage;

    private String mail;

    private String numTel;

    private List<CommandeFournisseurDto> commandeFournisseurs;
}
