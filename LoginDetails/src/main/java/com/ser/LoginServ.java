package com.ser;

import java.util.List;

import com.web.Emp;

public interface LoginServ {
	
	public Emp empLogin(Emp emp);
		
	public Emp getEmp(Long accnum);	
	public List<Emp> getEmpLogin();
	
	public Emp deposit(Long accnum,Double money);
	
	public Emp with(Long accnum);
	

}
