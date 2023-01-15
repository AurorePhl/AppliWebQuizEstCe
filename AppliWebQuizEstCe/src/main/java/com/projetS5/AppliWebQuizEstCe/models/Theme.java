package com.projetS5.AppliWebQuizEstCe.models;

import java.util.HashMap;

public class Theme<T> {
	private String currentTheme;
	private HashMap <String,Piece> themes;
	
	public Theme () {
		themes = new HashMap<String,Piece>();
		currentTheme = "";
	}
	
	//Ajout des thèmes avec leur plateau de jeu associé
	public void addTheme(String nomTheme,Piece plateauDeJeu) {
		themes.put(nomTheme,plateauDeJeu);
		
	}
	//Methode pour definir le theme de la partie en cours
	public void setcurrentTheme(String nomTheme) {
		currentTheme=nomTheme;
	
	}
	//Methode pour obtenir le thème de la partie en cours
	public String getCurrentTheme() {
		return currentTheme; 
	}
	
	//obtenir le plateau de jeu associé au thème actuel
	 public Piece getButeursFrancaisForCurrentTheme(){
	        return themes.get(currentTheme);
	    }

	public HashMap<String, Piece> getThemes() {
		return themes;
	}

	public void setThemes(HashMap<String, Piece> themes) {
		this.themes = themes;
	}

	public void setCurrentTheme(String currentTheme) {
		this.currentTheme = currentTheme;
	}
	 
}
