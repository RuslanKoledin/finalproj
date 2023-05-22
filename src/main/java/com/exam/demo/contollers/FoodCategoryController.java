package com.exam.demo.contollers;

import com.exam.demo.services.FoodCategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class FoodCategoryController {
    FoodCategoryService foodCategoryService;
}
