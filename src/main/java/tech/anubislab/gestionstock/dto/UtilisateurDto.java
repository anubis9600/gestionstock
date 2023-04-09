package tech.anubislab.gestionstock.dto;

import lombok.Builder;
import lombok.Data;
import tech.anubislab.gestionstock.model.Adresse;

import java.time.Instant;
import java.util.List;

@Builder
@Data
public class UtilisateurDto {

    private String nom;

    private String prenom;

    private String email;

    private Instant dateDeNaissance;

    private String motDePasse;

    private Adresse adresse;

    private String imageUrl;

    private EntrepriseDto entreprise;

    private List<RoleDto> roles;

}