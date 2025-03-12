package com.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.model.ModelRestApi;

public interface RepositoryRestApi extends JpaRepository<ModelRestApi,String>{

}
