package tech.anubislab.gestionstock.dto;


import lombok.Builder;
import lombok.Data;
import tech.anubislab.gestionstock.model.TypeMvtStk;

import java.math.BigDecimal;
import java.time.Instant;

@Builder
@Data
public class MvtStkDto {

    private Instant dateMvt;

    private BigDecimal quantite;

    private TypeMvtStk typeMvt;

    private ArticleDto article;
}
