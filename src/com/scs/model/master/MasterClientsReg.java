package com.scs.model.master;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="MA_CLIENTS_REGISTER")

public class MasterClientsReg {

	@Id
	@Column(name="CL_ID")
	private long clientId;
	
	@Column(name="CL_APPLIED")
	private Date appliedDate;
	
	@Column(name="CL_APPROVED")
	private Date approvedDate;
	
	@Column(name="CL_DENIED")
	private Date deniedDate;

	public long getClientId() {
		return clientId;
	}

	public Date getAppliedDate() {
		return appliedDate;
	}

	public Date getApprovedDate() {
		return approvedDate;
	}

	public Date getDeniedDate() {
		return deniedDate;
	}

	public void setClientId(long clientId) {
		this.clientId = clientId;
	}

	public void setAppliedDate(Date appliedDate) {
		this.appliedDate = appliedDate;
	}

	public void setApprovedDate(Date approvedDate) {
		this.approvedDate = approvedDate;
	}

	public void setDeniedDate(Date deniedDate) {
		this.deniedDate = deniedDate;
	}
	
}
