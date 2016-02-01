package com.developersdelicias.repository;

import java.util.List;

/**
 * 
 * @author Benjamin Cisneros <cisnerosbarraza@gmail.com>
 *
 * @param <E> Entity object
 */
public interface Repository<E> {
	
	/**
	 * Retrieve all objects of type E
	 * 
	 * @return A list of objects of type E
	 */
	public List<E> retrieveAll();

}
