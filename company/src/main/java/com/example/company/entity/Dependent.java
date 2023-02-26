package com.example.company.entity;

import java.util.Date;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "dependent")
public class Dependent {
    @EmbeddedId
	private DependentId id;
	
	private String sex;
	
	private Date bdate;
	
	private String relationship;

	public Dependent() {
		super();
	}

	

	public Dependent(DependentId id, String sex, Date bdate, String relationship) {
		super();
		this.id = id;
		this.sex = sex;
		this.bdate = bdate;
		this.relationship = relationship;
	}



	public DependentId getId() {
		return id;
	}

	public void setId(DependentId id) {
		this.id = id;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
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
	
	
	
	
}
