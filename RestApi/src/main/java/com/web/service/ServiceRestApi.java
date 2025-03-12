package com.web.service;

import java.util.List;

import com.web.model.ModelRestApi;
import com.web.repository.RepositoryRestApi;

public interface ServiceRestApi {
	
	 
	
	public ModelRestApi getModel(String rollnum);
	public String insertModel(ModelRestApi model);
	public String updatetModel(ModelRestApi model); 
	public String deleteModel(String rollnum); 
	public List<ModelRestApi> getAllModel();

}
