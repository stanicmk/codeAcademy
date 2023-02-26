package com.example.company.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class DeptLocationId implements Serializable{
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Department dNumber;
	
	private String dLocation;
	
	

	public DeptLocationId(Department dNumber, String dLocation) {
		super();
		this.dNumber = dNumber;
		this.dLocation = dLocation;
	}

	public Department getdNumber() {
		return dNumber;
	}

	public void setdNumber(Department dNumber) {
		this.dNumber = dNumber;
	}

	public String getdLocation() {
		return dLocation;
	}

	public void setdLocation(String dLocation) {
		this.dLocation = dLocation;
	}

	public DeptLocationId( String dLocation) {
		super();
		
		this.dLocation = dLocation;
	}

	public DeptLocationId() {
		super();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dLocation == null) ? 0 : dLocation.hashCode());
		result = prime * result + ((dNumber == null) ? 0 : dNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DeptLocationId other = (DeptLocationId) obj;
		if (dLocation == null) {
			if (other.dLocation != null)
				return false;
		} else if (!dLocation.equals(other.dLocation))
			return false;
		if (dNumber == null) {
			if (other.dNumber != null)
				return false;
		} else if (!dNumber.equals(other.dNumber))
			return false;
		return true;
	}

	
}
