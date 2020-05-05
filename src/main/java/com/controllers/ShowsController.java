package com.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.ShowDTO;
import com.interfaces.Service;

@RestController
public class ShowsController {

	@Autowired
	public Service service;

	@GetMapping("/findShows")
	@CrossOrigin(origins = "http://localhost:4200")
	public ResponseEntity<?> findShows(){
		List<ShowDTO> showsDTO = null;
		try {
			showsDTO = service.findShows();
			return new ResponseEntity<List<ShowDTO>>(showsDTO, HttpStatus.OK);
		}catch(Exception e) {
			return new ResponseEntity<String>("There was an issue with returning tv shows info", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
