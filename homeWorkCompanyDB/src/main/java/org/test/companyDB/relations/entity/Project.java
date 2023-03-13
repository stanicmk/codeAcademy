package org.test.companyDB.relations.entity;

import java.io.Serializable;
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
import javax.persistence.OneToOne;
import javax.persistence.Table;




@Entity
@Table(name="project")
public class Project implements Serializable{
	
	@Column(name="pname")
	private String pname;
	
	@Id
	private Long pnumber;
	
	@Column(name="plocation")
	private String plocation;
	
	@OneToOne(targetEntity = org.test.companyDB.relations.entity.Department.class, cascade = CascadeType.ALL)
	@JoinColumn(name="dnum")
	private Department department;
	
	

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Long getPnumber() {
		return pnumber;
	}

	public void setPnumber(Long pnumber) {
		this.pnumber = pnumber;
	}

	public String getPlocation() {
		return plocation;
	}

	public void setPlocation(String plocation) {
		this.plocation = plocation;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	

	public Project(String pname, Long pnumber, String plocation, Department department, List<Employee> employees) {
		super();
		this.pname = pname;
		this.pnumber = pnumber;
		this.plocation = plocation;
		this.department = department;
		
	}

	public Project() {
		super();
	}
	
	
	
	
}	