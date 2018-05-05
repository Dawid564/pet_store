package com.pet_shop.repository;

import com.pet_shop.domain.Pet;

import java.util.List;
import java.util.Map;

public interface StoreRepo {

    List<Map<String,String>> listAnimal();
    void removeAnimal(int id);
    void databaseAnimalAdd(Pet pet);
}
