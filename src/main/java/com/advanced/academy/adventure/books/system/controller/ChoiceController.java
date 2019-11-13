package com.advanced.academy.adventure.books.system.controller;

import com.advanced.academy.adventure.books.system.models.adventure.Choice;
import com.advanced.academy.adventure.books.system.service.ChoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/choice")
public class ChoiceController {

    private final ChoiceService choiceService;

    @Autowired
    public ChoiceController(ChoiceService choiceService) {
        this.choiceService = choiceService;
    }

    @PostMapping
    public Choice createOrUpdate(@RequestBody Choice choice){
        return choiceService.createOrUpdate(choice);
    }
}
