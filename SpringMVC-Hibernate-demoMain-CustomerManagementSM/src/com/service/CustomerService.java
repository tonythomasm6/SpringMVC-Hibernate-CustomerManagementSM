package com.service;

import java.util.List;

import com.entity.Customer;

public interface CustomerService {
	
	public List<Customer> getCustomers();
	
	public void saveCustomer(Customer customer);
	
	public Customer getCustomer(int customerId);
	
	public void deleteCustomer(Customer c);
	
	public List<Customer> searchCustomer(String name);

}
