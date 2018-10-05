package com.app.Entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Publication implements Serializable {
	@Id
	@GeneratedValue
	private Long id;
	private String statut;
	private String photo1;
	private String photo3;
	private String datedebut;
	private String datefin;
	private int scorePhoto1;
	private int scorePhoto2;
	@ManyToOne
	private user use ;
	 @OneToMany
	private Set<Commentaire> commentaires;
	public String getStatut() {
		return statut;
	}
	public void setStatut(String statut) {
		this.statut = statut;
	}
	public String getPhoto1() {
		return photo1;
	}
	public void setPhoto1(String photo1) {
		this.photo1 = photo1;
	}
	public String getPhoto3() {
		return photo3;
	}
	public void setPhoto3(String photo3) {
		this.photo3 = photo3;
	}
	public String getDatedebut() {
		return datedebut;
	}
	public void setDatedebut(String datedebut) {
		this.datedebut = datedebut;
	}
	public String getDatefin() {
		return datefin;
	}
	public void setDatefin(String datefin) {
		this.datefin = datefin;
	}
	public int getScorePhoto1() {
		return scorePhoto1;
	}
	public void setScorePhoto1(int scorePhoto1) {
		this.scorePhoto1 = scorePhoto1;
	}
	public int getScorePhoto2() {
		return scorePhoto2;
	}
	public void setScorePhoto2(int scorePhoto2) {
		this.scorePhoto2 = scorePhoto2;
	}
	public user getUse() {
		return use;
	}
	public void setUse(user use) {
		this.use = use;
	}
	public Set<Commentaire> getCommentaires() {
		return commentaires;
	}
	public void setCommentaires(Set<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @param statut
	 * @param photo1
	 * @param photo3
	 * @param datedebut
	 * @param datefin
	 * @param scorePhoto1
	 * @param scorePhoto2
	 * @param use
	 * @param commentaires
	 */
	public Publication(String statut, String photo1, String photo3, String datedebut, String datefin, int scorePhoto1,
			int scorePhoto2, user use, Set<Commentaire> commentaires) {
		super();
		this.statut = statut;
		this.photo1 = photo1;
		this.photo3 = photo3;
		this.datedebut = datedebut;
		this.datefin = datefin;
		this.scorePhoto1 = scorePhoto1;
		this.scorePhoto2 = scorePhoto2;
		this.use = use;
		this.commentaires = commentaires;
	}
	/**
	 * @param statut
	 * @param photo1
	 * @param photo3
	 * @param datedebut
	 * @param datefin
	 * @param scorePhoto1
	 * @param scorePhoto2
	 */
	public Publication(String statut, String photo1, String photo3, String datedebut, String datefin, int scorePhoto1,
			int scorePhoto2) {
		super();
		this.statut = statut;
		this.photo1 = photo1;
		this.photo3 = photo3;
		this.datedebut = datedebut;
		this.datefin = datefin;
		this.scorePhoto1 = scorePhoto1;
		this.scorePhoto2 = scorePhoto2;
	}
	/**
	 * 
	 */
	public Publication() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
