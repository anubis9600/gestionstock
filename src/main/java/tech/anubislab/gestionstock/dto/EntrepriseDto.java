package tech.anubislab.gestionstock.dto;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;
import tech.anubislab.gestionstock.model.Adresse;
import tech.anubislab.gestionstock.model.Utilisateur;

import java.util.List;

@Builder
@Data
public class EntrepriseDto {

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
