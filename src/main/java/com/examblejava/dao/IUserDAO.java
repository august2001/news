package com.examblejava.dao;

import com.examblejava.model.UserModel;

public interface IUserDAO  extends GenericDAO<UserModel> {
	UserModel findByUserNameAndPasswordAndStatus (String userName, String password, Integer Status);
}
