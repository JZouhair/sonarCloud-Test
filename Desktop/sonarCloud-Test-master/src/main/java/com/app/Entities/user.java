package com.app.Entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class user implements Serializable {
	@Id
	@GeneratedValue
	private Long id ;
	private String nom;
	private String tele;
	private String photo;
	private String pass;
	private Publication publication;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getTele() {
		return tele;
	}
	public void setTele(String tele) {
		this.tele = tele;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public Publication getPublication() {
		return publication;
	}
	public void setPublication(Publication publication) {
		this.publication = publication;
	}
	/**
	 * @param nom
	 * @param tele
	 * @param photo
	 * @param pass
	 * @param publication
	 */
	public user(String nom, String tele, String photo, String pass, Publication publication) {
		super();
		this.nom = nom;
		this.tele = tele;
		this.photo = photo;
		this.pass = pass;
		this.publication = publication;
	}
	/**
	 * @param nom
	 * @param tele
	 * @param photo
	 * @param pass
	 */
	public user(String nom, String tele, String photo, String pass) {
		super();
		this.nom = nom;
		this.tele = tele;
		this.photo = photo;
		this.pass = pass;
	}
	/**
	 * 
	 */
	public user() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
