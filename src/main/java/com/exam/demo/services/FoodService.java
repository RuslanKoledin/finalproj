package com.exam.demo.services;

<<<<<<< HEAD
import com.exam.demo.entities.Food;
=======
>>>>>>> origin/main
import com.exam.demo.repositories.FoodRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> origin/main
@Service
@AllArgsConstructor
public class FoodService {
    FoodRepo foodRepo;
<<<<<<< HEAD
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
=======
>>>>>>> origin/main
}
