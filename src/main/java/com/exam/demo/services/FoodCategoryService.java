package com.exam.demo.services;

import com.exam.demo.entities.FoodCategory;
import com.exam.demo.repositories.FoodCategoryRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FoodCategoryService {
    FoodCategoryRepo foodCategoryRepo;
    public FoodCategory getById(Long id) {
        return foodCategoryRepo.findById(id).get();
    }

    public List<FoodCategory > getAllFoodCategories() {
        return foodCategoryRepo.findAll();
    }

    public Long saveFoodCategory(FoodCategory foodCategory) {
        return foodCategoryRepo.save(foodCategory).getId();
    }

    public void deleteFoodCategoryById(Long id) {
        foodCategoryRepo.deleteById(id);
    }

    public FoodCategory updateById(FoodCategory foodCategory) {
        return foodCategoryRepo.save(foodCategory);
    }
}
