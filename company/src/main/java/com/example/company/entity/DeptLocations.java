package com.example.company.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dept_location")
public class DeptLocations {
	@EmbeddedId
	private DeptLocationId id;

	public DeptLocations(DeptLocationId id) {
		super();
		this.id = id;
	}

	public DeptLocations() {
		super();
	}

	public DeptLocationId getId() {
		return id;
	}

	public void setId(DeptLocationId id) {
		this.id = id;
	}

	
}
