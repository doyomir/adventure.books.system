package com.advanced.academy.adventure.books.system.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "tags")
public class Tag {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "value", unique = true)
    private  String value;
   @ManyToMany(mappedBy = "tags")
    private Set<Adventure> adventure = new HashSet<>();

}
