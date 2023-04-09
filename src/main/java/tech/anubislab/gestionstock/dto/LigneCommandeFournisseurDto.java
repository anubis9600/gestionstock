package tech.anubislab.gestionstock.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class LigneCommandeFournisseurDto {

    private ArticleDto article;

    private CommandeFournisseurDto commandeFournisseurs;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;
}
