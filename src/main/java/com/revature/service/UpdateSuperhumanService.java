package com.revature.service;

import com.revature.dao.SuperDAOPostgres;

public class UpdateSuperhumanService implements UpdateSuperhuman {
	
	// Maybe make it so that before updating them all you read the id and then see what is getting updated
	@Override
	public void updateSuperhuman(Integer superid, String supername, String aliases, String hometown, String nemesis,
			Integer alignmentid) {
		SuperDAOPostgres superDAO = new SuperDAOPostgres();
		superDAO.updateSuperhuman(superid, supername, aliases, hometown, nemesis, alignmentid);

	}

}
