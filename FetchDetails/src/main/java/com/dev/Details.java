package com.dev;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Details {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		//load the class
		Class.forName("oracle.jdbc.OracleDriver");
		
		//create the connection
		Connection connection=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","admin");
		
		//create the statement
		Statement statement=connection.createStatement();
		
		//execute the query
		ResultSet resultset=statement.executeQuery("select * from spring");
		
		//fetch the data
		while(resultset.next()) {
			System.out.println(resultset.getInt("id")+"   "+resultset.getString("name")+"   "+resultset.getString("dept"));
		}
	}
	}
//select * from employees;
//create table spring (id int,name varchar(16),dept varchar(16));
//insert into spring values(46,'Gowtham','FD');
//insert into spring values(28,'Brinda','FD');
//select * from spring;

