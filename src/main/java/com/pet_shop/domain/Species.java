package com.pet_shop.domain;

import javax.persistence.*;

@Entity
@Table(name = "species", catalog = "petstore", uniqueConstraints = @UniqueConstraint(columnNames = {"id", "species"}))
public class Species {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "species")
    private String species;

    public int getId() {
        return id;
    }

    public String getSpecies() {
        return species;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSpecies(String species) {
        this.species = species;
    }
}
