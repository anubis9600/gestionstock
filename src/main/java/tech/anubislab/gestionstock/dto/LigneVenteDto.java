package tech.anubislab.gestionstock.dto;

import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;

@Builder
@Data
public class LigneVenteDto {

    private Integer id;

    private VentesDto vente;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;
}
