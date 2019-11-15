package com.advanced.academy.adventure.books.system.controller;

import com.advanced.academy.adventure.books.system.models.Hero;
import com.advanced.academy.adventure.books.system.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/hero")

public class HeroController {

    private final HeroService heroservice;

    @Autowired
    public HeroController(HeroService heroservice) {
        this.heroservice = heroservice;
    }

    @PostMapping
    public Hero createOrUpdate (@RequestBody Hero hero){
        return heroservice.createOrUpdate(hero);
    }

    @GetMapping(value = "cusrtomer/{customerId}")
    public List<Hero> getHeroList(@PathVariable("customerId") Integer customerId){
        return heroservice.getHeroByCustomerId(customerId);

    }

    @GetMapping(value = "/{heroId}")
    public Hero getHero(@PathVariable("heroId") Integer heroId){
        return heroservice.getHeroById(heroId);
    }
}
