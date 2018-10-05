package com.app.Entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Commentaire implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private String contenue;
	private String date;
	@ManyToOne
	private user userr ;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getContenue() {
		return contenue;
	}
	public void setContenue(String contenue) {
		this.contenue = contenue;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public user getuserr() {
		return userr;
	}
	public void setuserr(user userr) {
		this.userr = userr;
	}
	/**
	 * @param contenue
	 * @param date
	 * @param userr
	 */
	public Commentaire(String contenue, String date, user userr) {
		super();
		this.contenue = contenue;
		this.date = date;
		this.userr = userr;
	}
	/**
	 * @param contenue
	 * @param date
	 */
	public Commentaire(String contenue, String date) {
		super();
		this.contenue = contenue;
		this.date = date;
	}
	/**
	 * 
	 */
	public Commentaire() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
