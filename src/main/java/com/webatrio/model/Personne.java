package com.webatrio.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "personnes", schema="dbo", catalog="TestDB")
public class Personne {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idpersonne")
	private Integer id;
	
	@Column(name="nompersonne")
	private String nom;
	
	@Column(name="prenomPersonne")
	private String prenom;
	
	@Column(name="datenaissPersonne")
	private Date datenaiss;

	public Personne() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDatenaiss() {
		return datenaiss;
	}

	public void setDatenaiss(Date datenaiss) {
		this.datenaiss = datenaiss;
	}
	
}
