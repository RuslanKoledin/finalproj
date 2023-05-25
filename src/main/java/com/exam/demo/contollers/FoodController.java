package com.exam.demo.contollers;

<<<<<<< HEAD
import com.exam.demo.entities.Food;
import com.exam.demo.services.FoodService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
=======
import com.exam.demo.services.FoodService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;
>>>>>>> origin/main

@RestController
@AllArgsConstructor
public class FoodController {
    FoodService foodService;
<<<<<<< HEAD
    @GetMapping("/food/{id}")
    Food getById(@PathVariable Long id) {
        return foodService.getById(id);
    }

    @GetMapping("/food/all")
    List<Food> getAllFoods() {
        return foodService.getAllFoods();
    }

    @PostMapping("/food/save")
    Long saveNewFood(@RequestBody Food food) {
        return foodService.saveFood(food);
    }

    @DeleteMapping("/food/delete/{id}")
    void deleteFoodById(@PathVariable Long id) {
        foodService.deleteFoodById(id);
    }

    @PutMapping("/food/update")
    Food updateFoodById(@RequestBody Food food) {
        return foodService.updateById(food);
    }
=======
>>>>>>> origin/main
}
