package com.projetS5.AppliWebQuizEstCe.models;

import java.util.Set;

import lombok.Data;

@Data
public class Questions {
	private int idQuestion;
	private String motCle;
	private String question;
	private Set<Res> res;
	
	public int getIdQuestion() {
		return idQuestion;
	}
	public void setIdQuestion(int idQuestion) {
		this.idQuestion = idQuestion;
	}
	public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	public String getQuestion() {
		return question;
	}
	public void setQuestion(String question) {
		this.question = question;
	}
	public Set<Res> getRes() {
		return res;
	}
	public void setRes(Set<Res> res) {
		this.res = res;
	}
	
}
