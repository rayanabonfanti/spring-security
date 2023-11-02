package com.basicauth.mysql.repositories;

import com.basicauth.mysql.model.Customer;
import com.basicauth.mysql.model.CustomerTemp;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    List<Customer> findByCustomerLogin(String customerLogin);

    @Query(value = "SELECT customer_id, customer_login, customer_name FROM customer",
            nativeQuery = true)
    List<CustomerTemp> findGetAll();
}
