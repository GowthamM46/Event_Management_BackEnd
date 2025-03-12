package org.rep;

import org.springframework.data.jpa.repository.JpaRepository;

import com.web.Emp;

public interface LoginRep extends JpaRepository<Emp, Long>{

}
