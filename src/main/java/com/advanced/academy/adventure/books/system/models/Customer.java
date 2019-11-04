package com.advanced.academy.adventure.books.system.models;

import com.advanced.academy.adventure.books.system.models.enums.UserType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "customers")
public class Customer {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "type")
    @Enumerated(EnumType.STRING)
    private UserType type;
    @Column(name = "email")
    private String email;
    @Column(name = "user_name")
    private String userName;



    public Integer getId() {
        return id;
    }


    public UserType getType() {
        return type;
    }

    public void setType(UserType type) {
        this.type = type;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


}
