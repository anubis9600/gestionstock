package tech.anubislab.gestionstock.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class RoleDto {

    private Integer id;

    private String roleName;

    private UtilisateurDto utilisateur;
}
