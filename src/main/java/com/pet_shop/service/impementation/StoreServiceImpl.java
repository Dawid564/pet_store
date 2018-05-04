package com.pet_shop.service.impementation;

import com.pet_shop.repository.StoreRepo;
import com.pet_shop.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements StoreService{

    @Autowired
    StoreRepo storeRepo;

    @Override
    public void listAnimal() {
        storeRepo.listAnimal();
    }
}
