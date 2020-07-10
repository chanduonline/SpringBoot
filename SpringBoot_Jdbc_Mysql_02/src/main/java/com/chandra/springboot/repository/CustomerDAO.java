package com.chandra.springboot.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.chandra.springboot.model.Customer;

@Repository
public class CustomerDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static final String SQL = "SELECT * FROM CUSTOMER";

	public List<Customer> getCustomerList() {
		List<Customer> customers = new ArrayList<Customer>();
		List<Map<String, Object>> rows = jdbcTemplate.queryForList(SQL);
		for (Map<String, Object> row : rows) {
			Customer customer = new Customer();
			customer.setCustomerNo((int) row.get("cust_id"));
			customer.setCustomerName((String) row.get("cust_name"));
			customer.setCountry((String) row.get("cust_country"));
			customers.add(customer);
		}
		return customers;
	}

}
