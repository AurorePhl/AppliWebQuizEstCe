package com.projetS5.AppliWebQuizEstCe.models;

import lombok.Data;

@Data
public class ReponseTrue {
	private int idRes;
	private int idQuestion;
	private int idButeur;
	public int getIdRes() {
		return idRes;
	}
	public void setIdRes(int idRes) {
		this.idRes = idRes;
	}
	public int getIdQuestion() {
		return idQuestion;
	}
	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}
	public int getIdButeur() {
		return idButeur;
	}
	public void setIdButeur(int idButeur) {
		this.idButeur = idButeur;
	}
	
}
