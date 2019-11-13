package com.advanced.academy.adventure.books.system.controller;

import com.advanced.academy.adventure.books.system.models.adventure.Step;
import com.advanced.academy.adventure.books.system.service.StepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/step")
public class StepController {

    private final StepService stepService;

    @Autowired
    public StepController(StepService stepService) {
        this.stepService = stepService;
    }

    @PostMapping
    public Step createOrUpdate(@RequestBody Step step){
        return stepService.createOrUpdate(step);
    }
}
