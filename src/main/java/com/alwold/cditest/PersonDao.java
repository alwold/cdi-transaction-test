package com.alwold.cditest;

import com.alwold.cditest.model.Person;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created by alwold on 5/6/15.
 */
public class PersonDao {
	@PersistenceContext
	private EntityManager entityManager;

	public Person getPerson() {
		return entityManager.find(Person.class, 1);
	}
}
