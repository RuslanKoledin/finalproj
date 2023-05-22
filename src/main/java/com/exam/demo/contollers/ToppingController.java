package com.exam.demo.contollers;

import com.exam.demo.services.ToppingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class ToppingController {
    ToppingService toppingService;
}
