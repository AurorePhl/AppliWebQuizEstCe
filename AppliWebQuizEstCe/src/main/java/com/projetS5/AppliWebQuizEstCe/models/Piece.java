package com.projetS5.AppliWebQuizEstCe.models;

import java.util.ArrayList;
import java.util.HashMap;

public class Piece {
        /* Map contenant les pieces du plateau de jeu associées à une valeur binaire.
         * 1 veut dire que la pièce est grisée 
         * 0 veut dire que la pièce n'est pas grisée
         * Chaque clé est une chaine de caractère contenant le nom et le prénom de chacun des buteurs français. */
	    HashMap<String,Integer> nomPieces;
	    /* Chaine de caractère contenant la pièce sélectionnée par le joueur. */
		String pieceChoisie; 
		/* Chaine de caractère contenant la pièce choisie aléatoirement par la machine. */
		String pieceGagnante;
		/* Tableau contenant l'ensemble des pièces du plateau de jeu. 
		 * Chaque pièce contient le nom et le prénom de chacun des buteurs français.*/
		ArrayList<String> pieces;
		
		public Piece () {
			nomPieces=new HashMap<String,Integer>();
			for (int i = 0; i < nomPieces.size(); i++) {
			    nomPieces.put("",0);
			    pieces.add(""); 
			    //initialiser avec les données de l'api (?? buteurs.findAll().getNom()+" "+buteurs.findAll().getNom())
			}
			int random = (int) (1+(Math.random()*24));
			pieceGagnante = pieces.get(random);
		}

		public HashMap<String, Integer> getNomPieces() {
			return nomPieces;
		}

		public void setNomPieces(HashMap<String, Integer> nomPieces) {
			this.nomPieces = nomPieces;
		}

		public String getPieceChoisie() {
			return pieceChoisie;
		}

		public void setPieceChoisie(String pieceChoisie) {
			this.pieceChoisie = pieceChoisie;
		}

		public String getPieceGagnante() {
			return pieceGagnante;
		}

		public void setPieceGagnante(String pieceGagnante) {
			this.pieceGagnante = pieceGagnante;
		}

		public ArrayList<String> getPieces() {
			return pieces;
		}

		public void setPieces(ArrayList<String> pieces) {
			this.pieces = pieces;
		}

}
