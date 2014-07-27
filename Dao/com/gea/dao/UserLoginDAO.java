package com.gea.dao;

import java.util.ArrayList;

import com.gea.domain.UserLogin;

public interface UserLoginDAO {
	
	 public int insertUserLoginDetails(String userName, String password)throws Exception;
	 public ArrayList<UserLogin> getUserLoginDetails() throws Exception;
}
