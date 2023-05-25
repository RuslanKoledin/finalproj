package com.exam.demo.contollers;

import com.exam.demo.entities.Food;
import com.exam.demo.entities.FoodCategory;
import com.exam.demo.services.FoodCategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import com.exam.demo.services.FoodCategoryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class FoodCategoryController {
    FoodCategoryService foodCategoryService;
    @GetMapping("/foodCategory/{id}")
    FoodCategory getById(@PathVariable Long id){
        return foodCategoryService.getById(id);
    }
    @GetMapping("/foodCategory/all")
    List<FoodCategory> getAllFoodCategories(){
        return foodCategoryService.getAllFoodCategories();
    }
    @PostMapping("/foodCategory/save")
    Long saveNewFoodCategory(@RequestBody FoodCategory foodCategory){
        return foodCategoryService.saveFoodCategory(foodCategory);
    }
    @DeleteMapping("/foodCategory/delete/{id}")
    void deleteFoodCategory(@PathVariable Long id){
        foodCategoryService.deleteFoodCategoryById(id);
    }
    @PutMapping("/foodCategory/update")
    FoodCategory updateById(@RequestBody FoodCategory foodCategory){
        return foodCategoryService.updateById(foodCategory);
    }

}
