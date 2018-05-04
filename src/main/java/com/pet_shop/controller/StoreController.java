package com.pet_shop.controller;

import com.pet_shop.domain.Pet;
import com.pet_shop.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("/store")
public class StoreController {

    @Autowired
    StoreService storeService;

    @GetMapping()
    public String shop(){
        return "shop";
    }

    @GetMapping("/leave")
    public String leaveAnimal(Model model){
        model.addAttribute("pet", new Pet());
        return "leaveAnimal";
    }

    @PostMapping("/leave")
    public String leaveAnimal(@ModelAttribute Pet pet){
        return "redirect:/store/leave";
    }

    @GetMapping("/list")
    public String list(Model model){
        model.addAttribute("animals", storeService.listAnimal());
        return "list";
    }

    //remove pet from database
    @GetMapping("/remove/{animalId}")
    public String removeAnimal(@PathVariable int animalId){
        System.out.println("remove from database with id:" + animalId);
        storeService.removeAnimal(animalId);
        return "redirect:/store/list";
    }
}
