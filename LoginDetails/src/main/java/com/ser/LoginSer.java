package com.ser;

import java.util.List;

import org.rep.LoginRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.Emp;
@Service
public class LoginSer implements LoginServ {

	
	@Autowired
	LoginRep r;
	
	@Override
	public Emp empLogin(Emp emp) {
		Emp ee=r.save(emp);
		return ee;
	}

	@Override
	public Emp getEmp(Long accnum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Emp> getEmpLogin() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Emp deposit(Long accnum, Double money) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Emp with(Long accnum) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
