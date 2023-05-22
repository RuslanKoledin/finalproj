package com.exam.demo.repositories;

import com.exam.demo.entities.FoodCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodCategoryRepo extends JpaRepository<FoodCategory,Long> {
}
