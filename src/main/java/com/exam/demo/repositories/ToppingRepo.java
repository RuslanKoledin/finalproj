package com.exam.demo.repositories;

import com.exam.demo.entities.Topping;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ToppingRepo extends JpaRepository<Topping,Long> {
}
