package com.pet_shop.controller;

import com.pet_shop.domain.Pet;
import org.springframework.web.bind.annotation.*;

@org.springframework.web.bind.annotation.RestController
@RequestMapping("/operations")
public class RestController {

    @GetMapping("/{animalId}")
    public String getAnimal(@PathVariable String animalId){
        return null;
    }

    @PostMapping("/addAnimal")
    public String addAnimal(@ModelAttribute Pet pet){
        return null;
    }

    @PutMapping("/updateAnimal")
    public String updateAnimal(@ModelAttribute Pet pet){
        return null;
    }

    @DeleteMapping("/deleteAnimal/{animalId}")
    public String deleteAnimal(@PathVariable String animalId){
        return null;
    }
}
