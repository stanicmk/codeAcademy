package com.example.company.entity;

import javax.persistence.AssociationOverride;
import javax.persistence.AssociationOverrides;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.JoinColumn;

@Entity
@Table(name = "worksOn")

@AssociationOverrides({ @AssociationOverride(name = "id.essn", joinColumns = @JoinColumn(name = "ssn")),
	@AssociationOverride(name = "id.pno", joinColumns = @JoinColumn(name = "pnumber")) })
public class WorksOn {
	@EmbeddedId
	private WorksOnId id;
	
	private Double hours;

	public WorksOn(WorksOnId id, Double hours) {
		super();
		this.id = id;
		this.hours = hours;
	}

	public WorksOn() {
		super();
	}
	
	

	public WorksOn(WorksOnId id) {
		super();
		this.id = id;
	}

	public WorksOnId getId() {
		return id;
	}

	public void setId(WorksOnId id) {
		this.id = id;
	}

	public Double getHours() {
		return hours;
	}

	public void setHours(Double hours) {
		this.hours = hours;
	}

	
	
}
