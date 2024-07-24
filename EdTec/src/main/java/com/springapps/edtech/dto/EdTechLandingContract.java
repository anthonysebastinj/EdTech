package com.springapps.edtech.dto;

import java.sql.SQLException;
import java.util.List;

public interface EdTechLandingContract<EdTechLandingData> {

	public List<EdTechLandingData> getAllScholarsRecord() throws ClassNotFoundException, SQLException, Exception;
	
}
