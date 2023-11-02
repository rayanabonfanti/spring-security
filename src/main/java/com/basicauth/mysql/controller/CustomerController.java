package com.basicauth.mysql.controller;

import com.basicauth.mysql.exceptions.ServicesRuntimeException;
import com.basicauth.mysql.model.Customer;
import com.basicauth.mysql.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

@RequestMapping("/api/customer")
@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/getAllCustomers")
    public ResponseEntity<?> getAllCustomers() {
        HashMap hashMapGetAllCustomer = null;
        try{
            hashMapGetAllCustomer = customerService.getAllCustomers();
            if (hashMapGetAllCustomer.isEmpty() || hashMapGetAllCustomer.containsKey("Error")) {
                return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(hashMapGetAllCustomer);
            } else {
                return ResponseEntity.status(HttpStatus.OK).body(hashMapGetAllCustomer);
            }
        } catch(Exception e){
            hashMapGetAllCustomer.put("Error", new ServicesRuntimeException("Error get all customers! Details Error: " + e.getMessage()).getMessage());
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(hashMapGetAllCustomer);
        }
    }

}
