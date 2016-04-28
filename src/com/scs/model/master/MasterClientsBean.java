package com.scs.model.master;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="MA_CLIENTS_INFO")
public class MasterClientsBean {

	@Id
	@Column(name="CL_ID")
	private long clientId;
	
	@Column(name="CLNAME")
	private String clName;
	
	@Column(name="CL_ADDRESS")
	private String clAddress;
	
	@Column(name="CL_PHONE")
	private long clPhone;
	
	@Column(name="CL_LICENSE")
	private String licenseType;
	
	@Column(name="CL_START_DATE")
	private Date startDate;
	
	@Column(name="CL_END_DATE")
	private Date endDate;
	
	@Column(name="CL_INVOICE_DATE")
	private Date InvoiceDate;
	
	@Column(name="CL_STATUS")
	private String clStatus;

	public long getClientId() {
		return clientId;
	}

	public String getClName() {
		return clName;
	}

	public String getClAddress() {
		return clAddress;
	}

	public long getClPhone() {
		return clPhone;
	}

	public String getLicenseType() {
		return licenseType;
	}

	public Date getStartDate() {
		return startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public Date getInvoiceDate() {
		return InvoiceDate;
	}

	public String getClStatus() {
		return clStatus;
	}

	public void setClientId(long clientId) {
		this.clientId = clientId;
	}

	public void setClName(String clName) {
		this.clName = clName;
	}

	public void setClAddress(String clAddress) {
		this.clAddress = clAddress;
	}

	public void setClPhone(long clPhone) {
		this.clPhone = clPhone;
	}

	public void setLicenseType(String licenseType) {
		this.licenseType = licenseType;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public void setInvoiceDate(Date invoiceDate) {
		InvoiceDate = invoiceDate;
	}

	public void setClStatus(String clStatus) {
		this.clStatus = clStatus;
	}	

}
