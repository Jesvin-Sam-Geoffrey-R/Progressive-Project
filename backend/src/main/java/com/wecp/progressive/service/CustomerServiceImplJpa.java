package com.wecp.progressive.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wecp.progressive.entity.Customers;
import com.wecp.progressive.repository.CustomerRepository;

@Service
public class CustomerServiceImplJpa implements CustomerService
{
  
    private final CustomerRepository customerRepository;

    @Autowired
    public CustomerServiceImplJpa(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public List<Customers> getAllCustomers()
    {
    // throws SQLException {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getAllCustomers'");
       return customerRepository.findAll();
    }

    @Override
    public Customers getCustomerById(int customerId) 
    {
    //throws SQLException {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'getCustomerById'");
        return customerRepository.findByCustomerId(customerId);
    }

    @Override
    public int addCustomer(Customers customers) 

    {
    //throws SQLException {
        // int i =customers.getCustomerId();
        return customerRepository.save(customers).getCustomerId();
        

    }


    @Override
    public void updateCustomer(Customers customers) {
    //throws SQLException {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'updateCustomer'");
        
        customerRepository.save(customers);
        
    }

   
   

    @Override
    @Transactional
    public void deleteCustomer(int customerId) {
    //throws SQLException {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'deleteCustomer'");
        customerRepository.deleteByCustomerId(customerId);
    }

    @Override
    public List<Customers> getAllCustomersSortedByName() {
    // throws SQLException {
        // TODO Auto-generated method stub
        //  throw new UnsupportedOperationException("Unimplemented method 'getAllCustomersSortedByName'");
       return customerRepository.getAllCustomersSortedByName();
    }
   
    

    @Override
    public List<Customers> getAllCustomersFromArrayList() {
        // TODO Auto-generated method stub
       //throw new UnsupportedOperationException("Unimplemented method 'getAllCustomersFromArrayList'"); 
       return null;
    }

    @Override
    public List<Customers> addCustomersToArrayList(Customers customers) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'addCustomersToArrayList'");
        return null;
    }

    @Override
    public List<Customers> getAllCustomersSortedByNameFromArrayList() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'getAllCustomersSortedByNameFromArrayList'");
        return null;
    }

    @Override
    public void emptyArrayList() {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'emptyArrayList'");
    }

    
}