package com.pet_shop.service;


import java.util.List;
import java.util.Map;

public interface StoreService {

    List<Map<String,String>> listAnimal();
    void removeAnimal(int id);
}
