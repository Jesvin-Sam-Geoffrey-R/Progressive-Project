package com.wecp.progressive.controller;


import com.wecp.progressive.entity.Customers;
import com.wecp.progressive.entity.Transactions;
import com.wecp.progressive.service.CustomerService;
import com.wecp.progressive.service.CustomerServiceImpl;
import com.wecp.progressive.service.CustomerServiceImplJpa;

import org.hibernate.exception.JDBCConnectionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    
   private final CustomerService customerService;

    
    public CustomerController(@Qualifier("customerServiceImplJpa") CustomerService customerService) {
    this.customerService = customerService;
}

    @GetMapping
    public ResponseEntity<List<Customers>> getAllCustomers() throws SQLException
     {

        return new ResponseEntity<>(customerService.getAllCustomers(),HttpStatus.OK);
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<Customers> getCustomerById(@PathVariable int customerId) throws SQLException //throws SQLException 
    {
        return new ResponseEntity<Customers>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Integer> addCustomer(@RequestBody Customers customers) throws SQLException 
     {
        return new ResponseEntity<>(customerService.addCustomer(customers),HttpStatus.CREATED);
    }

    @PutMapping("/{customerId}")
    public ResponseEntity<Void> updateCustomer(@PathVariable int customerId,@RequestBody Customers customers) throws SQLException// throws SQLException
     {
        customers.setCustomerId(customerId);
        customerService.updateCustomer(customers);
        return new ResponseEntity<Void>(HttpStatus.OK);
        
    }
    @DeleteMapping("/{customerId}")
    public ResponseEntity<Void> deleteCustomer(@PathVariable int customerId) throws SQLException //throws SQLException 
     {
        customerService.deleteCustomer(customerId);
        return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
    }

    public ResponseEntity<List<Transactions>> getAllTransactionsByCustomerId(int cutomerId) {
        return null;
    }

    @ExceptionHandler(JDBCConnectionException.class)
    public ResponseEntity<String> exceptionHandler(JDBCConnectionException e){
        return new ResponseEntity<>(e.getMessage(),HttpStatus.INTERNAL_SERVER_ERROR);
    }


}
