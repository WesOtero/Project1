package com.revature.test;

import org.junit.Test;

import com.revature.service.AddSuperhumanService;
import com.revature.service.RemoveSuperhumanService;
import com.revature.service.UpdateSuperhumanService;
import com.revature.service.ViewAllSuperhumanService;

public class SuperhumanTest {
	
	@Test
	public void testAddSuperhumanServ() {
		AddSuperhumanService addSuperServ = new AddSuperhumanService();
		addSuperServ.addSuperuhman("Wes", "Awesome", "Somewhere", "You", 2);
	}

	@Test
	public void testRemoveSuperhumanServ() {
		RemoveSuperhumanService removeSuperServ = new RemoveSuperhumanService();
		removeSuperServ.removeSuperhuman(4);
	}
	
	@Test
	public void testUpdateSuperhumanServ() {
		UpdateSuperhumanService updateSuperServ = new UpdateSuperhumanService();
		updateSuperServ.updateSuperhuman(15, "Chonko", "Pulin", "Anywhere", "Yo' Mama", 1);
	}

	@Test
	public void testViewAllSuperhumanServ() {
		ViewAllSuperhumanService viewAllSuperServ = new ViewAllSuperhumanService();
		viewAllSuperServ.readAllSuperhumans();
	}

}
