package com.pet_shop.repository.implementation;


import com.pet_shop.repository.StoreRepo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

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
    public List<Map<String,String>> listAnimal() {
        String petQuery = "select new map(a.name as name, b.species as species) from Pet a inner join Species b on b.id = a.species";
        List<Map<String,String>> petList = getCurrentSession().createQuery(petQuery).list();

        /* check if list is not empty
        for (int i=0; i<petList.size(); i++){
            Map<String, String> map = petList.get(i);
            for (Map.Entry<String, String> entrySet : map.entrySet()){
                System.out.println("Key = " + entrySet.getKey()+ " , Value = " + entrySet.getValue());
            }
        }*/

        return petList;
    }
}
