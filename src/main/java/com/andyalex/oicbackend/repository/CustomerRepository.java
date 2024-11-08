package com.andyalex.oicbackend.repository;

import com.andyalex.oicbackend.entities.Customer;
import org.springframework.data.repository.CrudRepository;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
