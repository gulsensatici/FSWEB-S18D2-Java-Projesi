package com.workintech.fruit.vegetables.service;

import com.workintech.fruit.vegetables.entity.Fruit;

import java.util.List;

public interface FruitService {
    List<Fruit> findAll();
    List<Fruit> findAllByPriceDesc();
    List<Fruit> findAllByPriceAsc();
    List<Fruit> searchByName();

    List<Fruit> searchByName(String name);

    Fruit find(int id);
    Fruit save(Fruit fruit);
    void delete(Fruit fruit);
}
