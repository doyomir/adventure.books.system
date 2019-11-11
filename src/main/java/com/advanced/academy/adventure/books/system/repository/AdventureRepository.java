package com.advanced.academy.adventure.books.system.repository;

import com.advanced.academy.adventure.books.system.models.adventure.Adventure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdventureRepository extends CrudRepository<Adventure, Integer> {
}
