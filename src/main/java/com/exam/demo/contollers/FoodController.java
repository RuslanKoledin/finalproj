package com.exam.demo.contollers;

import com.exam.demo.services.FoodService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class FoodController {
    FoodService foodService;
}
