package com.controller;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.dao.CustomerDAO;
import com.entity.Customer;
import com.service.CustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@GetMapping("/list")
	public String getCustomer(Model model) {
		List<Customer> customers = customerService.getCustomers();
		for(Customer c:customers) {
			//System.out.println(c.toString());
		}
		model.addAttribute("customers",customers);
		return "customer/customerList";
	
	}

	
	@GetMapping("/addCustomer")
	public String addCustomer(Model model) {
		Customer customer = new Customer();
		model.addAttribute("customer",customer);
		return "customer/addCustomer";
	}
	
	@PostMapping("/addCustomer")
	public String postCustomer(@ModelAttribute("customer") Customer customer) {
		System.out.println(customer);
		customerService.saveCustomer(customer);
		return "redirect:/customer/list";
	}
	
	@GetMapping("/updateCustomer")
	public String updateCustomerForm(@RequestParam("customerId") int customerId, Model model) {
		Customer customerToUpdate = customerService.getCustomer(customerId);
		model.addAttribute("customer",customerToUpdate);
		return "customer/addCustomer";
	}
	
	@GetMapping("/deleteCustomer")
	public String deleteCustomer(@RequestParam("customerId") int customerId, Model model) {
		Customer c = customerService.getCustomer(customerId);
		customerService.deleteCustomer(c);
		return "redirect:/customer/list";
	}
	
	
}
