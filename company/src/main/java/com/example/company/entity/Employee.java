package com.example.company.entity;

import java.util.Date;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ssn;
	
	private String fname;
	
	private String lname;
	
	private String minit;
	
	private Date bdate;
	
	private String address;
	
	private String sex;
	
	private Integer salary;
	@ManyToOne
	@JoinColumn(name = "ssn",updatable = false, insertable = false)
	private Employee superSSN;
	
	@ManyToOne
	@JoinColumn(name = "dNumber")
	private Department dno;

	public Employee() {
		super();
	}

	public Employee(String fname, String lname, String minit, Date bdate, String address, String sex, Integer salary,
			Employee superSSN, Department dno) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.minit = minit;
		this.bdate = bdate;
		this.address = address;
		this.sex = sex;
		this.salary = salary;
		this.superSSN = superSSN;
		this.dno = dno;
	}
	

	public Employee(String fname, String lname, String minit, Date bdate, String address, String sex, Integer salary,
			Department dno) {
		super();
		this.fname = fname;
		this.lname = lname;
		this.minit = minit;
		this.bdate = bdate;
		this.address = address;
		this.sex = sex;
		this.salary = salary;
		this.dno = dno;
	}

	public Long getSsn() {
		return ssn;
	}

	public void setSsn(Long ssn) {
		this.ssn = ssn;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getMinit() {
		return minit;
	}

	public void setMinit(String minit) {
		this.minit = minit;
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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getSalary() {
		return salary;
	}

	public void setSalary(Integer salary) {
		this.salary = salary;
	}

	public Employee getSuperSSN() {
		return superSSN;
	}

	public void setSuperSSN(Employee superSSN) {
		this.superSSN = superSSN;
	}

	public Department getDno() {
		return dno;
	}

	@ManyToOne
	@JoinColumn(name = "dnumber")
	public void setDno(Department dno) {
		this.dno = dno;
	}

	
	
	

}
