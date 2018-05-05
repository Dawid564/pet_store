package com.pet_shop.domain;

import javax.persistence.*;

@Entity
@Table(name = "pet", catalog = "petstore", uniqueConstraints = @UniqueConstraint(columnNames = {"id"}))
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", unique = true, nullable = false)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "species")
    private Species species;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "color")
    private Color color;


    @Column(name = "price")
    private float price;

    @Column(name = "name")
    private String name;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public Species getSpecies() {
        return species;
    }

    public float getPrice() {
        return price;
    }

    public String getName() {
        return name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setSpecies(Species species) {
        this.species = species;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
