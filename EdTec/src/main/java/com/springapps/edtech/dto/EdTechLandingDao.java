package com.springapps.edtech.dto;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.springapp.productspring.utility.DbUtility;

public class EdTechLandingDao implements EdTechLandingContract<EdTechLandingData> {

	@Override
	public List<EdTechLandingData> getAllScholarsRecord() throws ClassNotFoundException, SQLException, Exception {
		Connection connection=null;
		Statement statement =null;
		ResultSet resultSet =null;
		List<EdTechLandingData> list=null;
		
		try {
			connection=DbUtility.createConnection();
			statement=connection.createStatement();
			resultSet=statement.executeQuery("select * from edlandingdata");

			if(resultSet.next()) {
				list=new ArrayList<EdTechLandingData>();
				int id=resultSet.getInt("Id");
				String username=resultSet.getString("Username");
				String description=resultSet.getString("Description");
				String userImage=resultSet.getString("User_image");
				double interested=resultSet.getDouble("Interested");
				
				EdTechLandingData edtechlandingdata = new EdTechLandingData( id,  username,  description,  userImage,  interested);
				list.add(edtechlandingdata);
				
			}
		} catch (ClassNotFoundException e) {
			throw e;
			
		} catch (SQLException e) {
			throw e;
			
		} catch (Exception e) {
			throw e;
			
		}
		return list;

	}

}
