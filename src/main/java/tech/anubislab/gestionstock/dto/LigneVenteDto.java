package tech.anubislab.gestionstock.dto;

import lombok.Builder;
import lombok.Data;
import tech.anubislab.gestionstock.model.Ventes;

import java.math.BigDecimal;

@Builder
@Data
public class LigneVenteDto {

    private VentesDto vente;

    private BigDecimal quantite;

    private BigDecimal prixUnitaire;
}
