package org.test.companyDB.relations.entity;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
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
@Table(name="department")
public class Department {
	
	@Column(name="dname")
	private String dname;
	
	@Id
	private Integer dnumber;
	
	
	@Column(name="mgrsstartdate")
	private Date mgrstartdate;
	


	
	public String getDname() {
		return dname;
	}


	public void setDname(String dname) {
		this.dname = dname;
	}


	public Integer getDnumber() {
		return dnumber;
	}


	public void setDnumber(Integer dnumber) {
		this.dnumber = dnumber;
	}


	public Date getMgrstartdate() {
		return mgrstartdate;
	}


	public void setMgrstartdate(Date mgrstartdate) {
		this.mgrstartdate = mgrstartdate;
	}


	public Department(String dname, Integer dnumber, Date mgrstartdate) {
		super();
		this.dname = dname;
		this.dnumber = dnumber;
		this.mgrstartdate = mgrstartdate;
	}


	public Department() {
		super();
	}

	
	
}	
