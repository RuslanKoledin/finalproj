package com.exam.demo.contollers;

import com.exam.demo.entities.Topping;
import com.exam.demo.services.ToppingService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class ToppingController {
    ToppingService toppingService;
    @GetMapping("/topping/{id}")
    Topping getById(@PathVariable Long id){
        return toppingService.getById(id);
    }
    @GetMapping("/toppin/all")
    List<Topping> getAllToppings(){
        return toppingService.getAllToppings();
    }
    @PostMapping("/topping/save")
    Long saveNewTopping(@RequestBody Topping topping){
        return toppingService.saveTopping(topping);
    }
    @DeleteMapping("/topping/delete/{id}")
    void deleteToppingById(@PathVariable Long id){
        toppingService.deleteToppingById(id);
    }

}
