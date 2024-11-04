package dev.galileu.aulaspring.dto;

import dev.galileu.aulaspring.entity.Category;
import lombok.Data;

@Data
public class CategoryDTO {

    private Long id;
    private String name;

    public CategoryDTO() {
    }

    public CategoryDTO(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CategoryDTO(Category entity) {
        id = entity.getId();
        name = entity.getName();
    }

    
}
