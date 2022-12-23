package com.projetS5.AppliWebQuizEstCe.models;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

import com.projetS5.AppliWebQuizEstCe.services.QuestionsServices;

public class MotCles {
	private Map<String,Integer> motCle; 
	private TreeSet<String> stockMotCles;
	private QuestionsServices questions;
	
	public MotCles() {
		stockMotCles = new TreeSet<String>();
		stockMotCles.addAll(questions.getMotCle());
		TreeSet<String> copy = (TreeSet<String>) stockMotCles.clone();
		motCle = new TreeMap<String,Integer>();
		for(int i=0 ; i<stockMotCles.size();i++) {
			motCle.put(copy.first(), 0);
			copy.remove(copy.first());
		}
	}
	
	
}
