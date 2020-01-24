package com.revature.service;

import com.revature.dao.SuperDAO;
import com.revature.dao.SuperDAOPostgres;

public class RemoveSuperhumanService implements RemoveSuperhuman {

	//Removed a record
	@Override
	public void removeSuperhuman(Integer superhumanid) {
		SuperDAO superDAO = new SuperDAOPostgres();
		superDAO.deleteSuperhuman(superhumanid);
	}

}
