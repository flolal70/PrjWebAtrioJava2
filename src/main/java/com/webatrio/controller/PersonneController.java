package com.webatrio.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webatrio.model.Personne;
import com.webatrio.service.PersonneService;

@RestController
public class PersonneController {
	
	private PersonneService personneService;
	
	@PostMapping("/personnes/creer")
	public Personne createPersonne(
						@RequestParam(value = "nom") String nom, 
						@RequestParam(value = "prenom") String prenom, 
						@RequestParam(value = "datenaiss") String datenaiss) {
		Personne pers = null;
		
		pers = personneService.createPersonne(nom, prenom, datenaiss);
		
		return pers;
	}

}
