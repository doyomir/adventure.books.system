package com.advanced.academy.adventure.books.system.repository;

import com.advanced.academy.adventure.books.system.models.adventure.Step;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StepRepository extends CrudRepository <Step, Integer>, GetReference {
}
