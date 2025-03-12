package com.web.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.web.model.ModelRestApi;
import com.web.repository.RepositoryRestApi;


@Service
public class ServiceClassRestApi implements ServiceRestApi{
	
	RepositoryRestApi rep;
	
	

	public ServiceClassRestApi(RepositoryRestApi rep) {
		
		this.rep = rep;
	}

	@Override
	public ModelRestApi getModel(String rollnum) {
	    
		return rep.findById(rollnum).get();
	}

	@Override
	public String insertModel(ModelRestApi model) {
		rep.save(model);
		return "Success insert";
	}

	@Override
	public String updatetModel(ModelRestApi model) {
		rep.save(model);
		return "Update success";
	}

	@Override
	public String deleteModel(String rollnum) {
		rep.deleteById(rollnum);
		return "Success delete";
	}

	@Override
	public List<ModelRestApi> getAllModel() {
		
		return rep.findAll();
	}

}
