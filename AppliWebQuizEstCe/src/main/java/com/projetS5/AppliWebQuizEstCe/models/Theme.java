package com.projetS5.AppliWebQuizEstCe.models;
import java.util.ArrayList;
import java.util.HashMap;

public class Theme {
	private String currentTheme;
	private HashMap <String,ArrayList<ButeursFrancais>> themes;
	
	public Theme () {
		themes = new HashMap<String,ArrayList <ButeursFrancais>>();
		currentTheme = "";
	}
	//Ajout des thèmes avec les questions associées
	public void addTheme(String theme,ArrayList<ButeursFrancais> Buteurs) {
		themes.put(theme,ButeursFrancais);
		
	}
	//Methode pour definir le theme 
	public void setcurrentTheme(String theme) {
		currentTheme=theme;
	
	}
	//Methode pour obtenir le thème actuel
	public String getCurrentTheme() {
		return currentTheme; 
		
	}
	//obtenir les questions associées au thème actuel
	 public ArrayList<ButeursFrancais> getButeursFrancaisForCurrentTheme(){
	        return themes.get(currentTheme);
	    }
}
