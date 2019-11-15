package com.advanced.academy.adventure.books.system.service;


import com.advanced.academy.adventure.books.system.models.Hero;
import com.advanced.academy.adventure.books.system.models.adventure.Adventure;
import com.advanced.academy.adventure.books.system.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class HeroService {

    private final HeroRepository heroRepository;

    @Autowired
    public HeroService(HeroRepository heroRepository) {
        this.heroRepository = heroRepository;
    }

    public Hero createOrUpdate(Hero hero){
        hero.setCurrentReputation(heroRepository.getReference(Adventure.class, hero.getAdventure().getId()).getStartingReputation());
        hero.setNumberOfLives(heroRepository.getReference(Adventure.class, hero.getAdventure().getId()).getNumberOfLives());
        return heroRepository.save(hero);

    }

    public List<Hero> getHeroByCustomerId(Integer customerId){
        List<Hero> heroList = new ArrayList<>();
        Optional<List<Hero>> result = heroRepository.getHeroesByCustomerId(customerId);
        if(result.isPresent()){
            heroList.addAll(result.get());

        }
        return heroList;

    }

    public Hero getHeroById(Integer heroId){
        Hero hero =null;
        Optional<Hero> result = heroRepository.findById(heroId);
        if(result.isPresent()){
            hero = result.get();
        }
        return hero;
    }
}
