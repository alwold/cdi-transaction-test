package com.alwold.cditest;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Created by alwold on 5/6/15.
 */
@Stateless(name = "service")
public class Service implements ServiceLocal {
	@Inject
	private PersonDao personDao;

	@Override
	public String getHello() {
		return personDao.getPerson().getName();
	}
}
