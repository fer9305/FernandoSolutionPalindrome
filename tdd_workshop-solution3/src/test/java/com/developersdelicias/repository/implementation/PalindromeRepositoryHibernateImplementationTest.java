package com.developersdelicias.repository.implementation;

import org.hibernate.SessionFactory;
import org.junit.Before;
import org.springframework.beans.factory.annotation.Autowired;

import com.developersdelicias.repository.PalindromeRepositoryTest;

public class PalindromeRepositoryHibernateImplementationTest extends PalindromeRepositoryTest {

	@Autowired
	private SessionFactory _sessionFactory;
	
	@Before
	public void setUp() {
		repository = new PalindromeRepositoryHibernateImplementation(_sessionFactory);

	}

}
