package com.pet_shop.service;


import com.pet_shop.domain.Pet;

import java.util.List;
import java.util.Map;

public interface StoreService {

    List<Map<String,String>> listAnimal();
    void removeAnimal(int id);
    void databaseAnimalAdd(Pet pet);
}
