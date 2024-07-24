package com.springapp.edtech.controller;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springapps.edtech.dto.EdTechLandingContract;
import com.springapps.edtech.dto.EdTechLandingData;
@RestController
public class EdtechController {

	@Autowired
	private EdTechLandingContract<EdTechLandingData> _service;

	@GetMapping(path = "/customers")
	@CrossOrigin(origins = "*")
	public ResponseEntity<List<EdTechLandingData>> getCustomers()
			throws ClassNotFoundException, SQLException {
		try {
			List<EdTechLandingData> custRecords = _service.getAllScholarsRecord();
			System.out.println("request came");
			return ResponseEntity.ok(custRecords);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		} catch (SQLException e) {
			e.printStackTrace();
			return ResponseEntity.internalServerError().build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.internalServerError().build();
		}
	}
}
