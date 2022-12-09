package com.webatrio.service;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webatrio.model.Personne;
import com.webatrio.repository.PersonneRepository;

@Service
public class PersonneService {

	@Autowired
	private PersonneRepository personneRepository;
	
	
	public Personne createPersonne(String nom, String prenom, String datenaiss) {
		Personne newPers = new Personne();
		
		newPers.setNom(nom);
		newPers.setPrenom(prenom);
		
		@SuppressWarnings({ "deprecation", "unused" })
		Date naiss = new Date(datenaiss);
		newPers.setDatenaiss(naiss);
		
		personneRepository.save(newPers); //oubli
		
		return newPers;
	}
	
	
}
