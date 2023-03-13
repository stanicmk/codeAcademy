package org.test1.dbCompany;

import java.sql.Date;

public class Department {
	
	private String dname;
	private Integer dnumber;
	private Integer mgrssn;
	private Integer mgrstartdate;
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
	public Integer getMgrssn() {
		return mgrssn;
	}
	public void setMgrssn(Integer mgrssn) {
		this.mgrssn = mgrssn;
	}
	public Integer getMgrstartdate() {
		return mgrstartdate;
	}
	public void setMgrstartdate(Integer mgrstartdate) {
		this.mgrstartdate = mgrstartdate;
	}
	public Department() {
		super();
	}
	public Department(String dname, Integer dnumber, Integer mgrssn, int mgrstartdate) {
		super();
		this.dname = dname;
		this.dnumber = dnumber;
		this.mgrssn = mgrssn;
		this.mgrstartdate = mgrstartdate;
	}
	
	

}
