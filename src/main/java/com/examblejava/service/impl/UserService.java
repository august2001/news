package com.examblejava.service.impl;

import javax.inject.Inject;

import com.examblejava.dao.IUserDAO;
import com.examblejava.model.UserModel;
import com.examblejava.service.IUserService;

public class UserService implements IUserService{

	@Inject
	private IUserDAO userDAO;
	
	@Override
	public UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status) {
		return userDAO.findByUserNameAndPasswordAndStatus(userName, password, status);
	}

}
