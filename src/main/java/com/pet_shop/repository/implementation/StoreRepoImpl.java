package com.pet_shop.repository.implementation;


import com.pet_shop.domain.Pet;
import com.pet_shop.repository.StoreRepo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
@EnableTransactionManagement
public class StoreRepoImpl implements StoreRepo{

    @Autowired
    SessionFactory sessionFactory;

    protected Session getCurrentSession(){
        return sessionFactory.getCurrentSession();
    }

    @Override
    public void listAnimal() {
        List<Pet> pet;

        pet = getCurrentSession().createQuery("from Pet").list();

        System.out.println("The name of the dog is:");
        for (Pet i : pet){
            System.out.println(i.getName());
        }
    }
}
