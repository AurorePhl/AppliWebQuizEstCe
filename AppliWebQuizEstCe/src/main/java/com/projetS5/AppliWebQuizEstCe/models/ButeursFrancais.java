package com.projetS5.AppliWebQuizEstCe.models;

import java.sql.Date;

import lombok.Data;

@Data
public class ButeursFrancais {

	private String id;
	private String nom;
	private String prenom;
	private int nbButsMarques;
	private int debutActivite; 
	private int finActivite;
	private Date dateDeNaissance; 
	private int nbTES;
	private int nbTEC;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
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
	public int getNbButsMarques() {
		return nbButsMarques;
	}
	public void setNbButsMarques(int nbButsMarques) {
		this.nbButsMarques = nbButsMarques;
	}
	public int getDebutActivite() {
		return debutActivite;
	}
	public void setDebutActivite(int debutActivite) {
		this.debutActivite = debutActivite;
	}
	public int getFinActivite() {
		return finActivite;
	}
	public void setFinActivite(int finActivite) {
		this.finActivite = finActivite;
	}
	public Date getDateDeNaissance() {
		return dateDeNaissance;
	}
	public void setDateDeNaissance(Date dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
	}
	public int getNbTES() {
		return nbTES;
	}
	public void setNbTES(int nbTES) {
		this.nbTES = nbTES;
	}
	public int getNbTEC() {
		return nbTEC;
	}
	public void setNbTEC(int nbTEC) {
		this.nbTEC = nbTEC;
	}
	
}
