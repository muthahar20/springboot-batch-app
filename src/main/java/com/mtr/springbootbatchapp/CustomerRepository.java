package com.mtr.springbootbatchapp;

import com.mtr.springbootbatchapp.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

import java.io.Serializable;

public interface CustomerRepository extends JpaRepository<Customer, Serializable> {

}