package org.test.companyDB.relations.entity;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="dependent")
public class Dependent {
	
	@Id
	private String dependent_name;
	
	@OneToOne(targetEntity = org.test.companyDB.relations.entity.Employee.class, cascade = CascadeType.ALL)
	@JoinColumn(name="essn")
	private Employee employee;
	
	@Column(name="sex")
	private Character sex;
	
	@Column(name="bdate")
	private Date bdate;
	
	@Column(name="relationship")
	private String relationship;

	public String getDependent_name() {
		return dependent_name;
	}

	public void setDependent_name(String dependent_name) {
		this.dependent_name = dependent_name;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Character getSex() {
		return sex;
	}

	public void setSex(Character sex) {
		this.sex = sex;
	}

	public Date getBdate() {
		return bdate;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	public String getRelationship() {
		return relationship;
	}

	public void setRelationship(String relationship) {
		this.relationship = relationship;
	}

	public Dependent(String dependent_name, Employee employee, Character sex, Date bdate, String relationship) {
		super();
		this.dependent_name = dependent_name;
		this.employee = employee;
		this.sex = sex;
		this.bdate = bdate;
		this.relationship = relationship;
	}

	public Dependent() {
		super();
	}
	
	
	
}
