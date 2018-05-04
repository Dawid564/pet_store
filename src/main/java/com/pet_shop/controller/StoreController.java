package com.pet_shop.controller;

import com.pet_shop.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public String leaveAnimal(){
        return "leaveAnimal";
    }

    @GetMapping("/list")
    public String list(Model model){
        //"listAnimal", storeService.listAnimal();
        Map<String, String> foods = new HashMap<String, String>();
        foods.put("man", "mango");
        foods.put("app", "apple");
        foods.put("gra", "grapes");
        model.addAttribute("foods", foods);
        return "list";
    }
}
