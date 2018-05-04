package com.pet_shop.service.impementation;

import com.pet_shop.repository.StoreRepo;
import com.pet_shop.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class StoreServiceImpl implements StoreService{

    @Autowired
    StoreRepo storeRepo;

    @Override
    public List<Map<String,String>> listAnimal() {
        return storeRepo.listAnimal();
    }

    @Override
    public void removeAnimal(int id) {
        storeRepo.removeAnimal(id);
    }
}
