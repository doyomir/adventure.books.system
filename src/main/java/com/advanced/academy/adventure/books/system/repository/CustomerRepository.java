package com.advanced.academy.adventure.books.system.repository;

import com.advanced.academy.adventure.books.system.models.Customer;
import com.advanced.academy.adventure.books.system.models.enums.UserType;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository <Customer, Integer>{
    //public List<Customer> findByUserType(UserType userType);

    @Query("SELECT c FROM Customer c where userType =:userType")
    public List<Customer> getByUserType(@Param("userType") UserType userType);

    @Query(value = "SELECT c.* FROM customer c where c.user_Type =:userType", nativeQuery = true)
    public List<Customer> getByUserTypeNativeQuery(@Param("userType") UserType userType);

    @Query("UPDATE Customer SET isDeleted = true WHERE id =: id")
    void deactivateCustomer(@Param("id") Integer id);



}
