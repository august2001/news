package com.examblejava.dao;

import java.util.List;

import com.examblejava.model.NewModel;
import com.examblejava.paging.Pageble;

public interface INewDAO extends GenericDAO<NewModel> {
	NewModel findOne (Long id);
	List<NewModel> findByCategoryId(Long categoryId);
	Long save(NewModel newModel); 
	void update(NewModel updateNew);
	void delete(long id);
	List<NewModel> findAll(Pageble pageble);
	int getTotalItem();
}
