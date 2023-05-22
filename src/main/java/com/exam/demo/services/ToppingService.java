package com.exam.demo.services;

import com.exam.demo.entities.Food;
import com.exam.demo.entities.Topping;
import com.exam.demo.repositories.ToppingRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ToppingService {
    ToppingRepo toppingRepo;
    public Topping getById(Long id) {
        return toppingRepo.findById(id).get();
    }

    public List<Topping> getAllToppings() {
        return toppingRepo.findAll();
    }

    public Long saveTopping(Topping topping) {
        return toppingRepo.save(topping).getId();
    }

    public void deleteToppingById(Long id) {
        toppingRepo.deleteById(id);
    }

    public Topping updateById(Topping topping) {
        return toppingRepo.save(topping);
    }
}
