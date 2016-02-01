package com.developersdelicias.repository.implementation;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.developersdelicias.model.Palindrome;
import com.developersdelicias.repository.PalindromeRepository;

@Repository
public class PalindromeRepositoryHibernateImplementation implements PalindromeRepository {

	private SessionFactory sessionFactory;

	@Autowired
	public PalindromeRepositoryHibernateImplementation(SessionFactory _sessionFactory) {
		sessionFactory = _sessionFactory;
	}

	@Override
	public List<Palindrome> retrieveAll() {
		Session session = sessionFactory.getCurrentSession();

		@SuppressWarnings("unchecked")
		final List<Palindrome> list = session.createQuery("from Palindrome").list();

		return list;
	}

}
