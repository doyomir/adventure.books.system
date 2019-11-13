package com.advanced.academy.adventure.books.system.repository;

import com.advanced.academy.adventure.books.system.models.adventure.Choice;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChoiceRepository extends CrudRepository<Choice, Integer>, GetReference {
}
