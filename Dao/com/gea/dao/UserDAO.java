package com.gea.dao;

import java.util.ArrayList;

import com.gea.domain.User;

public interface UserDAO {
    public int insertUser(String fname, String lname)throws Exception;
    public ArrayList<User> selectUsers()throws Exception;
}