package com.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

	@Autowired
	private SessionFactory sessionFactory; 
	
	
	@Override
	public List<Customer> getCustomers() {
		Session session = sessionFactory.getCurrentSession();
		Query<Customer> query = session.createQuery("from Customer",Customer.class);
		List<Customer> customers = query.getResultList();
		return customers;
	}


	@Override
	public void saveCustomer(Customer customer) {
		Session session = sessionFactory.getCurrentSession();
		session.saveOrUpdate(customer);
		
	}


	@Override
	public Customer getCustomer(int id) {
		Session session = sessionFactory.getCurrentSession();
		Customer c = session.get(Customer.class, id);
		return c;
	}
	
	public void deleteCustomer(Customer c) {
		Session session = sessionFactory.getCurrentSession();
		session.delete(c);
	}


	@Override
	public List<Customer> searchCustomer(String name) {
		Session session = sessionFactory.getCurrentSession();
		Query query = null;
		if(name !=null && !name.isEmpty()) {
			  query =session.createQuery("from Customer where lower(firstName) like :theName or lower(lastName) like :theName", Customer.class);
	            query.setParameter("theName", "%" + name.toLowerCase() + "%");
		}else {
			query = session.createQuery("from Customer", Customer.class);
		}
		List<Customer> customers = query.getResultList();
		return customers;
	}
	

}
