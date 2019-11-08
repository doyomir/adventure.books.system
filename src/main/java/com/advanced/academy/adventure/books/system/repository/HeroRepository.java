package com.advanced.academy.adventure.books.system.repository;

import com.advanced.academy.adventure.books.system.models.Hero;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HeroRepository extends CrudRepository<Hero, Integer> {

    @Query("Select h FROM Hero h Where customer.id = :customerId")
    Optional<List<Hero>> getHeroesByCustomerId(@Param("customerId") Integer id);
}
