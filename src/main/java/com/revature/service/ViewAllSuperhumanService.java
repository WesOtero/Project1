package com.revature.service;

import java.util.List;

import com.revature.dao.SuperDAOPostgres;
import com.revature.pojo.Superhuman;

public class ViewAllSuperhumanService implements ViewAllSuperhuman{

	@Override
	public List<Superhuman> readAllSuperhumans() {
		// TODO Auto-generated method stub
		SuperDAOPostgres superDAO = new SuperDAOPostgres();
		return superDAO.readAllSuperhumans();
		
	}

}
