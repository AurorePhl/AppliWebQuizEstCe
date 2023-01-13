package com.projetS5.AppliWebQuizEstCe.models;

import java.util.Set;

import lombok.Data;

@Data
public class Res {

	private String idRes;
	private boolean res;
	private Set<ButeursFrancais> buteursFrancais;
	
	public String getIdRes() {
		return idRes;
	}
	public void setIdRes(String idRes) {
		this.idRes = idRes;
	}
	public boolean isRes() {
		return res;
	}
	public void setRes(boolean res) {
		this.res = res;
	}
	public Set<ButeursFrancais> getButeursFrancais() {
		return buteursFrancais;
	}
	public void setButeursFrancais(Set<ButeursFrancais> buteursFrancais) {
		this.buteursFrancais = buteursFrancais;
	}

}
