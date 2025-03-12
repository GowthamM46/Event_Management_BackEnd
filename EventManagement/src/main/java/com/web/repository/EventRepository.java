package com.web.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.entity.Events;

public interface EventRepository extends JpaRepository<Events, Integer>{

}
