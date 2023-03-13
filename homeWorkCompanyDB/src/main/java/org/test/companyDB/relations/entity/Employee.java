package org.test.companyDB.relations.entity;


import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="employee")
public class Employee implements Serializable {
	
	
	@Column(name="fname")
	private String fname;
	
	@Column(name="minit")
	private Character minit;
	
	@Column(name="lname")
	private String lname;
	
	@Id
	private Long ssn;
	
	@Column(name="bdate")
	private Date bdate;
	
	@Column(name="address")
	private String address;
	
	@Column(name="sex")
	private Character sex;
	
	@Column(name="salary")
	private Integer salary;
	
	@Column(name="superssn")
	private Long superssn;
	
	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name="dno", nullable = false)
	private Department department;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name="mgrssn")
	private List<Department> departments;
	

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public Character getMinit() {
		return minit;
	}

	public void setMinit(Character minit) {
		this.minit = minit;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public Long getSsn() {
		return ssn;
	}

	public void setSsn(Long ssn) {
		this.ssn = ssn;
	}

	public Date getBdate() {
		return bdate;
	}

	public void setBdate(Date bdate) {
		this.bdate = bdate;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Character getSex() {
		return sex;
	}

	public void setSex(Character sex) {
		this.sex = sex;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Long getSuperssn() {
		return superssn;
	}

	public void setSuperssn(Long superssn) {
		this.superssn = superssn;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public Employee(String fname, Character minit, String lname, Long ssn, Date bdate, String address, Character sex,
			Integer salary, Long superssn) {
		super();
		this.fname = fname;
		this.minit = minit;
		this.lname = lname;
		this.ssn = ssn;
		this.bdate = bdate;
		this.address = address;
		this.sex = sex;
		this.salary = salary;
		this.superssn = superssn;
		
	}

	public Employee() {
		super();
	}

	

}

