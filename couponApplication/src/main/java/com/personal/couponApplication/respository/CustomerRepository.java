package com.personal.couponApplication.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.personal.couponApplication.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, String> {

}
