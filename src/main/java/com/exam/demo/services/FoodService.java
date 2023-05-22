package com.exam.demo.services;

import com.exam.demo.repositories.FoodRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class FoodService {
    FoodRepo foodRepo;
}
