package com.scs.service;

import java.util.List;

import com.scs.model.master.MasterClientsBean;

public interface MasterServiceInterface {

	List<MasterClientsBean> getMasterDetails(long clId);
	
	
}
