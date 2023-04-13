package tech.anubislab.gestionstock.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import tech.anubislab.gestionstock.model.Category;

@Data
@Builder
public class CategoryDto {

    private Integer id;
    
    private String code;

    private String designation;

    private List<ArticleDto> articles;

    public CategoryDto fromEntity(Category category){
        if (category == null) {
            return null;
        }

        return CategoryDto.builder()
                .id(category.getId())
                .code(category.getCode())
                .designation(category.getDesignation())
                .build();        
    }

    public CategoryDto toEntity(CategoryDto categoryDto){
        if (categoryDto == null) {
            return null;
        }

        return CategoryDto.builder()
                .id(categoryDto.getId())
                .code(categoryDto.getCode())
                .designation(categoryDto.getDesignation())
                .build();        
    }
}
