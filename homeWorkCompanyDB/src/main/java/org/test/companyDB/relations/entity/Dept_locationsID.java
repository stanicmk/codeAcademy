package org.test.companyDB.relations.entity;

import java.io.Serializable;

public class Dept_locationsID implements Serializable {
	
	private Long dnumber;

	public Long getDnumber() {
		return dnumber;
	}

	public void setDnumber(Long dnumber) {
		this.dnumber = dnumber;
	}

	public Dept_locationsID(Long dnumber) {
		super();
		this.dnumber = dnumber;
	}

	public Dept_locationsID() {
		super();
	}
	
	

}
