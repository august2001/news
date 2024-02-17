package com.examblejava.service.impl;

import java.util.List;

import javax.inject.Inject;

import com.examblejava.dao.ICategoryDAO;
import com.examblejava.model.CategoryModel;
import com.examblejava.service.ICategoryService;

public class CategoryService implements ICategoryService {
	
	//web servlet
	@Inject
	private ICategoryDAO categoryDao;
	
	@Override
	public List<CategoryModel> findAll() {
		return categoryDao.findAll();
	}
	
}
