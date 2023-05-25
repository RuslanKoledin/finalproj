package com.exam.demo.services;

import com.exam.demo.entities.Food;
import com.exam.demo.repositories.FoodRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FoodService {
    FoodRepo foodRepo;

    public Food getById(Long id) {
        return foodRepo.findById(id).get();
    }

    public List<Food> getAllFoods() {
        return foodRepo.findAll();
    }

    public Long saveFood(Food food) {
        return foodRepo.save(food).getId();
    }

    public void deleteFoodById(Long id) {
        foodRepo.deleteById(id);
    }

    public Food updateById(Food food) {
        return foodRepo.save(food);
    }
}
