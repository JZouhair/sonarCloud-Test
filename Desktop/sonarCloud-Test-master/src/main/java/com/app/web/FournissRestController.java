package com.app.web;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entities.InterPublication;
import com.app.Entities.Publication;
import com.app.Entities.UserInterRepo;

@RestController
@CrossOrigin(origins = "http://localhost:8100", allowedHeaders="*")
public class FournissRestController {

	@Autowired
	private InterPublication interpublication ;
	@Autowired
	private UserInterRepo userInterRepo ;
	
	@RequestMapping(value="/AllPPublications",  method=RequestMethod.GET)
	public List<Publication> getAllPublication(){
		return interpublication.findAll();
	}
}
