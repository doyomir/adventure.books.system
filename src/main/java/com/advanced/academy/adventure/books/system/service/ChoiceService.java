package com.advanced.academy.adventure.books.system.service;

import com.advanced.academy.adventure.books.system.models.adventure.Choice;
import com.advanced.academy.adventure.books.system.models.adventure.Step;
import com.advanced.academy.adventure.books.system.repository.ChoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChoiceService {

    private final ChoiceRepository choiceRepository;

    @Autowired
    public ChoiceService(ChoiceRepository choiceRepository) {
        this.choiceRepository = choiceRepository;
    }

    public Choice createOrUpdate(Choice choice){
        choice.setStepGivenIn(
                choiceRepository.getReference(
                        choice.getStepGivenIn().getClass(),
                        choice.getStepGivenIn().getId()
                )
        );
        choice.setResultsInStep(
                choiceRepository.getReference(
                        Step.class,
                        choice.getResultsInStep().getId()
                )
        );
        Choice result = choiceRepository.save(choice);
        result.setStepGivenIn(null);
        result.setResultsInStep(null);
        return  result;

    }
}
