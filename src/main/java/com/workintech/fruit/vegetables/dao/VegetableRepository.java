package com.workintech.fruit.vegetables.dao;

import com.workintech.fruit.vegetables.entity.Fruit;
import com.workintech.fruit.vegetables.entity.Vegetable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface VegetableRepository extends JpaRepository<Vegetable, Integer> {
    @Query("SELECT v FROM VEGETABLE v ORDER BY v.price desc")
    List<Vegetable> getByPriceDesc();

    @Query("SELECT v FROM VEGETABLE v ORDER BY v.price asc")
    List<Vegetable> getByPriceAsc();
    @Query("SELECT v FROM VEGETABLE v WHERE v.name ilike %:name%")
    List<Vegetable> searchByName(String name);
}
