package com.projetS5.AppliWebQuizEstCe.models;

import java.util.Arrays;

public class PieceChoisie {
//tableau des 24 pièces, toutes les pièces sont à 0, si une pièce est choisie elle devient 1.
	int[] pieceschoisies;
	
	public PieceChoisie() {
		pieceschoisies=new int[24];
		for (int i = 0; i < pieceschoisies.length; i++) {
		    pieceschoisies[i] = 0;
		}
	}
}
