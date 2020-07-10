package com.chandra.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chandra.springboot.model.Customer;
import com.chandra.springboot.repository.CustomerDAO;

@RestController
public class CustomerController {

	@Autowired
	private CustomerDAO customerDAO;
	
	@RequestMapping("/all")
	public List<Customer> getAllCustomers()
	{
		List<Customer> customers = customerDAO.getCustomerList();
		return customers;
	}
	
	
}
