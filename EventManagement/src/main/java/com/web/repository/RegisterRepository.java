package com.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.entity.EventRegistration;

public interface RegisterRepository extends JpaRepository<EventRegistration,Integer>{

}
