package tech.anubislab.gestionstock.dto;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Builder;
import lombok.Data;
import tech.anubislab.gestionstock.model.Fournisseur;
import tech.anubislab.gestionstock.model.LigneCommandeFournisseur;

import java.time.Instant;
import java.util.List;

@Builder
@Data
public class CommandeFournisseurDto {

    private String code;

    private Instant dateCommande;

    private FournisseurDto fournisseur;

    private List<LigneCommandeFournisseurDto> ligneCommandeFournisseurs;

}
