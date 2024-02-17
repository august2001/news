package com.examblejava.service;

import com.examblejava.model.UserModel;

public interface IUserService {
	UserModel findByUserNameAndPasswordAndStatus(String userName, String password, Integer status);
}
