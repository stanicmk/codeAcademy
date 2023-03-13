package org.test.companyDB.relations.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
public class Dept_locations {
	
	@EmbeddedId
	private Dept_locationsID id;
	
	@ManyToOne
	@MapsId("dnumber")
	private Department department;
	
	@Column(name="dlocation")
	private String dlocation;

	public Dept_locationsID getId() {
		return id;
	}

	public void setId(Dept_locationsID id) {
		this.id = id;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public String getDlocation() {
		return dlocation;
	}

	public void setDlocation(String dlocation) {
		this.dlocation = dlocation;
	}

	public Dept_locations(Dept_locationsID id, Department department, String dlocation) {
		super();
		this.id = id;
		this.department = department;
		this.dlocation = dlocation;
	}

	public Dept_locations() {
		super();
	}
	
	
	
	

}
