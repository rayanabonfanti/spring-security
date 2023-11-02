package com.basicauth.mysql.service;

import com.basicauth.mysql.exceptions.ServicesRuntimeException;
import com.basicauth.mysql.model.Customer;
import com.basicauth.mysql.model.CustomerTemp;
import com.basicauth.mysql.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.List;

@Service("CustomerService")
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public LinkedHashMap getAllCustomers(){
        LinkedHashMap<String, Object> returnGetAllCustomer = new LinkedHashMap<>();
        try{
            List<CustomerTemp> getAllCustomers = customerRepository.findGetAll();
            returnGetAllCustomer.put("Customers", getAllCustomers);
        } catch(Exception e){
            returnGetAllCustomer.put("Error", new ServicesRuntimeException("Error find by get all customers! Details Error: " + e.getMessage()).getMessage());
        }
        return returnGetAllCustomer;
    }

}
