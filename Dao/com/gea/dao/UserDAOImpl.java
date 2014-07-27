package com.gea.dao;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.gea.domain.User;

@Repository
public class UserDAOImpl implements UserDAO{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insertUser(String fname, String lname) throws Exception{
		System.out.println("in insert"+jdbcTemplate);
		int affectedRows = jdbcTemplate.update("INSERT INTO user (fname, lname) VALUES (?, ?);", fname,lname);
		return affectedRows;
	}

	@Override
	public ArrayList<User> selectUsers() throws Exception{
		System.out.println("in selectUsers");
		return null;
	}

}
