package tech.anubislab.gestionstock.dto;

import lombok.Builder;
import lombok.Data;
import tech.anubislab.gestionstock.model.Adresse;

import java.util.List;

@Builder
@Data
public class EntrepriseDto {

    private Integer id;

    private String nom;

    private String description;

    private Adresse adresse;

    private String codeFiscal;

    private String imageUrl;

    private String email;

    private String numTel;

    private String siteWeb;

    private List<UtilisateurDto> utilisateurs;

}
