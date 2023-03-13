package org.test.companyDB.relations.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;

@Embeddable
public class Works_onID implements Serializable {
	
	
	private Long essn;
	
	
	private Long pno;
	
	
	
	public Long getEssn() {
		return essn;
	}

	public void setEssn(Long essn) {
		this.essn = essn;
	}

	public Long getPno() {
		return pno;
	}

	public void setPno(Long pno) {
		this.pno = pno;
	}

	public Works_onID(Long essn, Long pno) {
		super();
		this.essn = essn;
		this.pno = pno;
	}

	public Works_onID() {
		super();
	}
	
	
}