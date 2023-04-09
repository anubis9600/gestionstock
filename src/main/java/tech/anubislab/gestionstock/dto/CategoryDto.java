package tech.anubislab.gestionstock.dto;

import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import tech.anubislab.gestionstock.model.Article;

import java.util.List;

public class CategoryDto {

    private String code;

    private String designation;

    private List<ArticleDto> articles;
}
