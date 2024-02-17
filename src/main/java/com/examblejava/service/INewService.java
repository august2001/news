package com.examblejava.service;

import java.util.List;

import com.examblejava.model.NewModel;
import com.examblejava.paging.Pageble;

public interface INewService {
	List<NewModel> findByCategoryId (Long categoryId);
	NewModel save(NewModel newModel);
	NewModel update(NewModel updateNew);
	void delete(long[] ids);
	List<NewModel> findAll(Pageble pageble);
	int getTotalItem();
	NewModel findOne (long id);
}
