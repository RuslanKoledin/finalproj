package com.exam.demo.dto;

import com.exam.demo.entities.Topping;
import lombok.Data;

@Data
public class FoodDTO {
    private Long id;
    private String description;
    private int price;
    private boolean is_special;
    private boolean is_vegan;
    private boolean is_publish;
    private Topping topping;
}
