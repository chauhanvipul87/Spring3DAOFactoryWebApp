package com.gea.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gea.domain.UserLogin;

@Repository
public class UserLoginDAOImpl implements UserLoginDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insertUserLoginDetails(String userName, String password) throws Exception {
		int affectedRows = jdbcTemplate.update("INSERT INTO userlogin (username, password) VALUES (?, ?);", userName,password);
		return affectedRows;
	}

	@Override
	public ArrayList<UserLogin> getUserLoginDetails()throws Exception {
		System.out.println("jdbcTemplate in  UserLoginDAOImpl "+jdbcTemplate);
		return new ArrayList<UserLogin>();
	}

	
}
