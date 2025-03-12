package com.org;

public class Div {

	private void l1() {
	

	}
	private void l2() {


	}

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
