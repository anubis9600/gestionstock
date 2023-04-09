package tech.anubislab.gestionstock.dto;

import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;
import tech.anubislab.gestionstock.model.Category;

import java.math.BigDecimal;

@Builder
@Data
public class ArticleDto {

    private String codeArticle;

    private String designation;

    private BigDecimal prixUnitaireHt;

    private BigDecimal tauxTva;

    private BigDecimal prixUnitaireTtc;

    private String imageUrl;

    private CategoryDto category;
}
