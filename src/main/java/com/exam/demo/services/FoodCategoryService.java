package com.exam.demo.services;

<<<<<<< HEAD
import com.exam.demo.entities.FoodCategory;
=======
>>>>>>> origin/main
import com.exam.demo.repositories.FoodCategoryRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> origin/main
@Service
@AllArgsConstructor
public class FoodCategoryService {
    FoodCategoryRepo foodCategoryRepo;
<<<<<<< HEAD
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
=======
>>>>>>> origin/main
}
