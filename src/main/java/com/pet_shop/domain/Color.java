package com.pet_shop.domain;

import javax.persistence.*;

@Entity
@Table(name = "color", catalog = "petstore", uniqueConstraints = @UniqueConstraint(columnNames = {"id", "animalColor"}))
public class Color {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @Column(name = "animalColor", nullable = false)
    private String animalColor;

    @Column(name = "characteristics")
    private String characteristics;

    public int getId() {
        return id;
    }

    public String getAnimalColor() {
        return animalColor;
    }

    public String getCharacteristics() {
        return characteristics;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAnimalColor(String animalColor) {
        this.animalColor = animalColor;
    }

    public void setCharacteristics(String characteristics) {
        this.characteristics = characteristics;
    }
}
