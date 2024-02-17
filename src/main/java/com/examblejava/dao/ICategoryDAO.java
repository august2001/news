package com.examblejava.dao;

import java.util.List;

import com.examblejava.model.CategoryModel;

public interface ICategoryDAO extends GenericDAO<CategoryModel>{
	List<CategoryModel> findAll();
	CategoryModel findOne(long id);
	CategoryModel findOneByCode(String code);
}
