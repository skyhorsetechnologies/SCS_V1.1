package com.scs.dao.master;

import java.util.List;

import com.scs.model.master.MasterClientsBean;

public interface MasterDaoInterface {

	List<MasterClientsBean> getMasterDetails(long clId);

}
