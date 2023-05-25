package com.exam.demo.dto;

import lombok.Data;

@Data
public class FoodCategoryDTO {
    private Long id;
    private String name;
    private boolean is_publish;
}
