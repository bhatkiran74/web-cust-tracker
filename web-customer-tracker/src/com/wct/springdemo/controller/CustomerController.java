package com.wct.springdemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.wct.springdemo.dao.CustomerDAO;
import com.wct.springdemo.entity.Customer;

@Controller
@RequestMapping("/cust")
public class CustomerController {

	
	
	@Autowired
	private CustomerDAO custDao;
	
	
	@RequestMapping("/list")
	public String listCust(Model model) {
		
		List<Customer> listCust = custDao.listAll();
		System.out.println(listCust);
		model.addAttribute("listCust", listCust);
		
		return "list_cust";
	}
	
	
	
}
