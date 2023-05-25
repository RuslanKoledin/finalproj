package com.exam.demo.services;

<<<<<<< HEAD
import com.exam.demo.entities.Food;
import com.exam.demo.entities.Topping;
=======
>>>>>>> origin/main
import com.exam.demo.repositories.ToppingRepo;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import java.util.List;

=======
>>>>>>> origin/main
@Service
@AllArgsConstructor
public class ToppingService {
    ToppingRepo toppingRepo;
<<<<<<< HEAD
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
=======
>>>>>>> origin/main
}
