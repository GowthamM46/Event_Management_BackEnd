package com.nxt;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

import javax.sql.DataSource;

public class Clanew {

	private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}




	public List<DataFetch> getDetails() throws SQLException {
		
		List<DataFetch>li=new LinkedList<>();
		
		Connection connection = dataSource.getConnection();
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from data");
		
		while(resultSet.next()) {
			DataFetch dataFetch=new DataFetch(resultSet.getInt("Id"),
					                     resultSet.getString("Name"));
			li.add(dataFetch);		                  
		}
		return li;
	}
	
}
