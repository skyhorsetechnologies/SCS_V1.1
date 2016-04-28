package com.scs.model.master;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import oracle.sql.BLOB;

@Entity
@Table(name="MA_CLIENTS_PROFILE")
public class MasterClientsProfile {

	@Id
	@Column(name="CL_ID")
	private long clientId;
	
	@Column(name="CLNAME")
	private String clName;
	
	@Column(name="CL_PIC")
	private BLOB profPic;
	
	@Column(name="CL_ADMIN_NAME")
	private String AdminName;
	
	@Column(name="CL_ADMIN_ADDR")
	private String AdminAddr;
	
	@Column(name="CL_ADMIN_PHONE")
	private long AdminPhone;
	
	@Column(name="CL_ADMIN_EMAIL")
	private String AdminEmail;
	
	@Column(name="CL_SMS_USED")
	private Long SmsUsed;
	
	@Column(name="CL_CHILD_LOGIN")
	private int ChildLogins;

	public long getClientId() {
		return clientId;
	}

	public String getClName() {
		return clName;
	}

	public BLOB getProfPic() {
		return profPic;
	}

	public String getAdminName() {
		return AdminName;
	}

	public String getAdminAddr() {
		return AdminAddr;
	}

	public long getAdminPhone() {
		return AdminPhone;
	}

	public String getAdminEmail() {
		return AdminEmail;
	}

	public Long getSmsUsed() {
		return SmsUsed;
	}

	public int getChildLogins() {
		return ChildLogins;
	}

	public void setClientId(long clientId) {
		this.clientId = clientId;
	}

	public void setClName(String clName) {
		this.clName = clName;
	}

	public void setProfPic(BLOB profPic) {
		this.profPic = profPic;
	}

	public void setAdminName(String adminName) {
		AdminName = adminName;
	}

	public void setAdminAddr(String adminAddr) {
		AdminAddr = adminAddr;
	}

	public void setAdminPhone(long adminPhone) {
		AdminPhone = adminPhone;
	}

	public void setAdminEmail(String adminEmail) {
		AdminEmail = adminEmail;
	}

	public void setSmsUsed(Long smsUsed) {
		SmsUsed = smsUsed;
	}

	public void setChildLogins(int childLogins) {
		ChildLogins = childLogins;
	}
		
}
