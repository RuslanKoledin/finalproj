package com.exam.demo.services;

import com.exam.demo.repositories.ToppingRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ToppingService {
    ToppingRepo toppingRepo;
}
