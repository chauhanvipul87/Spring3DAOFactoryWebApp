package com.gea.dao;

import java.sql.SQLException;


public interface DAOFactory  {
	
	public abstract UserDAO getUserDAO() throws SQLException;
	public abstract UserLoginDAO getUserLoginDAO() throws SQLException;
	
		
}

