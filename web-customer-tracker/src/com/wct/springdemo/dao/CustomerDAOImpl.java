package com.wct.springdemo.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.wct.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	private SessionFactory factory;

	@Override
	@Transactional
	public List<Customer> listAll() {

		Session session = factory.getCurrentSession();

		Query<Customer> query = session.createQuery("from Customer", Customer.class);

		List<Customer> listCust = query.getResultList();

		return listCust;
	}

}
