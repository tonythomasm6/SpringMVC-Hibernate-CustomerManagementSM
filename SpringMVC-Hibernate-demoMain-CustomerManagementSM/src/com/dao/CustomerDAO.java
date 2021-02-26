package com.dao;

import java.util.List;

import com.entity.Customer;

public interface CustomerDAO {
	
	public List<Customer> getCustomers();
	
	public void saveCustomer(Customer customer);
	
	public Customer getCustomer(int id);
	
	public void deleteCustomer(Customer c);

}
