package com.scs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.scs.dao.master.MasterDaoInterface;
import com.scs.model.master.MasterClientsBean;

@Service
public class MasterServiceImpl implements MasterServiceInterface{
	
@Autowired
MasterDaoInterface MasdaoS;

public List<MasterClientsBean> getMasterDetails(long clId) {
	
	System.out.println("From Master Interface:"+clId);
	
	return MasdaoS.getMasterDetails(clId);
}



}
