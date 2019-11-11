package com.advanced.academy.adventure.books.system.controller;


import com.advanced.academy.adventure.books.system.models.adventure.Adventure;
import com.advanced.academy.adventure.books.system.service.AdventureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/adventure")
public class AdventureControler {

    private final AdventureService adventureService;

    @Autowired
    public AdventureControler(AdventureService adventureService){
        this.adventureService = adventureService;
    }

    @PostMapping
    public void createOrUpdate(@RequestBody Adventure adventure){
         adventureService.createOrUpdate(adventure);
    }

    @GetMapping
    public void getAll(){

    }
}
