package com.gea.dao;

import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DAOFactoryImpl  implements DAOFactory{
 
	@Autowired
	private UserDAO useDao;
	
	@Autowired
	private UserLoginDAO useLoginDao;
	
	public DAOFactoryImpl() {
    
	}
	
	@Override
	public UserDAO getUserDAO() throws SQLException {
		return this.useDao;
	}

	@Override
	public UserLoginDAO getUserLoginDAO() throws SQLException {
		return this.useLoginDao;
	}
	
	 

}
