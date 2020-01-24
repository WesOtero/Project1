package com.revature.service;

import com.revature.dao.SuperDAOPostgres;
import com.revature.pojo.Superhuman;

public class AddSuperhumanService implements AddSuperhuman{

	//Adds new superhuman
	@Override
	public void addSuperuhman(String supername, String alias, String hometown, String nemesis, Integer alignmentid) {
		Superhuman superhuman = new Superhuman(supername, alias, hometown, nemesis, alignmentid);
		SuperDAOPostgres superDAO = new SuperDAOPostgres();
		superDAO.createSuperhuman(superhuman);
	}
	
}
