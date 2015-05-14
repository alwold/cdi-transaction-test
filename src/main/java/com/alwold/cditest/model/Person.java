package com.alwold.cditest.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by alwold on 5/6/15.
 */
@Entity
public class Person {
	@Id
	private Long id;
	private String name;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
