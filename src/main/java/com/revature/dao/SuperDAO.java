package com.revature.dao;

import java.util.List;

import com.revature.pojo.Superhuman;

public interface SuperDAO {

	public void createSuperhuman(Superhuman superhuman);

	public Superhuman readSuperhuman(Integer superid);

	public void updateSuperhuman(Integer superid, String supername, String aliases, String hometown, String nemesis, Integer alignmentid);

	public void deleteSuperhuman(Integer superid);

	public List<Superhuman> readAllSuperhumans();
	
}
