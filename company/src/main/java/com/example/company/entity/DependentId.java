package com.example.company.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class DependentId implements Serializable{
    @ManyToOne(cascade = CascadeType.ALL)
	private Employee essn;
	
	private String dependent_name;

	public DependentId() {
		super();
	}

	public DependentId(Employee essn, String dependent_name) {
		super();
		this.essn = essn;
		this.dependent_name = dependent_name;
	}

	public Employee getEssn() {
		return essn;
	}

	public void setEssn(Employee essn) {
		this.essn = essn;
	}

	public String getDependent_name() {
		return dependent_name;
	}

	public void setDependent_name(String dependent_name) {
		this.dependent_name = dependent_name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dependent_name == null) ? 0 : dependent_name.hashCode());
		result = prime * result + ((essn == null) ? 0 : essn.hashCode());
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
		DependentId other = (DependentId) obj;
		if (dependent_name == null) {
			if (other.dependent_name != null)
				return false;
		} else if (!dependent_name.equals(other.dependent_name))
			return false;
		if (essn == null) {
			if (other.essn != null)
				return false;
		} else if (!essn.equals(other.essn))
			return false;
		return true;
	}
	
	
	
}
