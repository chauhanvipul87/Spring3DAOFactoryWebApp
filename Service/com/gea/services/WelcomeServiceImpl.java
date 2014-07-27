package com.gea.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gea.dao.DAOFactory;

@Service
public class WelcomeServiceImpl implements WelcomeServices  {

	@Autowired
	private DAOFactory dao;
	
	@Override
	public void processRequest() {
		System.out.println("in process request...");
		try {
			dao.getUserDAO().insertUser("vipul", "Cauhan");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void processRequest2() {
		System.out.println("in process request 2...");
		try {
			dao.getUserLoginDAO().insertUserLoginDetails("Vipul", "chauhan");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	
	
	
}
