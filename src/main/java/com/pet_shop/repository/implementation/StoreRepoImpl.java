package com.pet_shop.repository.implementation;


import com.pet_shop.domain.Color;
import com.pet_shop.domain.Pet;
import com.pet_shop.domain.Species;
import com.pet_shop.repository.StoreRepo;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;
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
        String petQuery = "select new map(a.name as name, b.species as species, a.id as id) from Pet a inner join Species b on b.id = a.species";
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

    //remove animal from database by id
    @Override
    public void removeAnimal(int id) {
        Query query = getCurrentSession().createQuery("delete from Pet where id = :id");
        query.setParameter("id", id);
        query.executeUpdate();
    }

    @Override
    public void databaseAnimalAdd(Pet pet) {
        pet.setColor(getColorObject());
        pet.setSpecies(getSpeciesObject());
        getCurrentSession().save(pet);

        /*
        Query petQuery = getCurrentSession().createQuery("insert into Pet (species,color,price,name) values (:species, :color, :price, :name)");
        petQuery.setParameter("species", 1);
        petQuery.setParameter("color", 0);
        petQuery.setParameter("price", pet.getPrice());
        petQuery.setParameter("name", pet.getName());
        System.out.println(petQuery.toString());
        petQuery.executeUpdate();
        */
    }

    private Color getColorObject(){
        List<Color> colorList;
        colorList = getCurrentSession().createQuery("from Color").list();
        return colorList.get(0);
    }

    private Species getSpeciesObject(){
        List<Species> speciesList;
        speciesList = getCurrentSession().createQuery("from Species").list();
        return speciesList.get(0);
    }
}
