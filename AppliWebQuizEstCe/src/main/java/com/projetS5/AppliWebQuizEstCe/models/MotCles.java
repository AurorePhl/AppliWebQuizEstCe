package com.projetS5.AppliWebQuizEstCe.models;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import com.projetS5.AppliWebQuizEstCe.services.QuestionsServices;

public class MotCles {
	private Map<String,Integer> motCle; 
	private TreeSet<String> stockMotCles;
	private QuestionsServices questions;
	private String motCleChoisi;
	
	public MotCles() {
		stockMotCles = new TreeSet<String>();
		stockMotCles.addAll(questions.getMotCle());
		TreeSet<String> copy = (TreeSet<String>) stockMotCles.clone();
		motCle = new TreeMap<String,Integer>();
		for(int i=0 ; i<stockMotCles.size();i++) {
			motCle.put(copy.first(), 0);
			copy.remove(copy.first());
		}
		motCleChoisi = null;
	}

	public Map<String, Integer> getMotCle() {
		return motCle;
	}

	public void setMotCle(Map<String, Integer> motCle) {
		this.motCle = motCle;
	}

	public TreeSet<String> getStockMotCles() {
		return stockMotCles;
	}

	public void setStockMotCles(TreeSet<String> stockMotCles) {
		this.stockMotCles = stockMotCles;
	}

	public QuestionsServices getQuestions() {
		return questions;
	}

	public void setQuestions(QuestionsServices questions) {
		this.questions = questions;
	}

	public String getMotCleChoisi() {
		return motCleChoisi;
	}

	public void setMotCleChoisi(String motCleChoisi) {
		this.motCleChoisi = motCleChoisi;
	}
	
	
	
}
