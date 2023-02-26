package com.example.company.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class WorksOnId implements Serializable{

	@ManyToOne(cascade = CascadeType.ALL)
	private Employee essn;
	
	@ManyToOne(cascade = CascadeType.ALL)
    private Project pno;

	public WorksOnId(Employee essn, Project pno) {
		super();
		this.essn = essn;
		this.pno = pno;
	}

	public WorksOnId() {
		super();
	}

	public Employee getEssn() {
		return essn;
	}

	public void setEssn(Employee essn) {
		this.essn = essn;
	}

	public Project getPno() {
		return pno;
	}

	public void setPno(Project pno) {
		this.pno = pno;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((essn == null) ? 0 : essn.hashCode());
		result = prime * result + ((pno == null) ? 0 : pno.hashCode());
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
		WorksOnId other = (WorksOnId) obj;
		if (essn == null) {
			if (other.essn != null)
				return false;
		} else if (!essn.equals(other.essn))
			return false;
		if (pno == null) {
			if (other.pno != null)
				return false;
		} else if (!pno.equals(other.pno))
			return false;
		return true;
	}
	
	
}
