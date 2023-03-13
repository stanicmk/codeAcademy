package org.test.companyDB.relations.entity;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
public class Works_on {
	
	@EmbeddedId
	private Works_onID id;
	
	@ManyToOne
	@MapsId("essn")
	private Employee employee;
	
	@ManyToOne
	@MapsId("pno")
	private Project project;
	
	@Column(name="hours")
	private Double hours;

	public Works_onID getId() {
		return id;
	}

	public void setId(Works_onID id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public Double getHours() {
		return hours;
	}

	public void setHours(Double hours) {
		this.hours = hours;
	}

	public Works_on(Works_onID id, Employee employee, Project project, Double hours) {
		super();
		this.id = id;
		this.employee = employee;
		this.project = project;
		this.hours = hours;
	}

	public Works_on() {
		super();
	}

	

	
	

}
