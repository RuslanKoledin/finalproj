package com.exam.demo.services;

import com.exam.demo.repositories.FoodCategoryRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FoodCategoryService {
    FoodCategoryRepo foodCategoryRepo;
}
