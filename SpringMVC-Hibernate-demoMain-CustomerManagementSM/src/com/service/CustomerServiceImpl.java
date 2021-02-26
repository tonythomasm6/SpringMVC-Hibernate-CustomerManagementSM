package com.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.CustomerDAOImpl;
import com.entity.Customer;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	private CustomerDAOImpl customerDaoImpl;
	
	@Override
	@Transactional // Service layer will define transactions now.
	public List<Customer> getCustomers() {
		List<Customer> customers = customerDaoImpl.getCustomers();
		return customers;
	}

	@Override
	@Transactional
	public void saveCustomer(Customer customer) {
		customerDaoImpl.saveCustomer(customer);
		
	}

	@Override
	@Transactional
	public Customer getCustomer(int customerId) {
		Customer c = customerDaoImpl.getCustomer(customerId);
		return c;
	}

	@Transactional
	public void deleteCustomer(Customer c) {
		customerDaoImpl.deleteCustomer(c);
	}

	@Override
	@Transactional
	public List<Customer> searchCustomer(String name) {
		return customerDaoImpl.searchCustomer(name);
	}


}
