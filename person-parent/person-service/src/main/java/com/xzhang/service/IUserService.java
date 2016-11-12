package com.xzhang.service;

import java.util.List;

import com.xzhang.model.User;



public interface IUserService {

	public User getUserById(String id);

	List<User> getAll();

	List<User> getAll2();

	List<User> getAll3();

}
