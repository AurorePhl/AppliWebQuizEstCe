package com.projetS5.AppliWebQuizEstCe.models;

import java.util.ArrayList;
import java.util.HashMap;

import com.projetS5.AppliWebQuizEstCe.services.ButeursFrancaisServices;

public class Piece<T> {
        /* Map contenant les pieces du plateau de jeu associées à une valeur binaire.
         * 1 veut dire que la pièce est grisée 
         * 0 veut dire que la pièce n'est pas grisée
         * Chaque clé est une chaine de caractère contenant le nom et le prénom de chacun des buteurs français. */
	    HashMap<String,Integer> nomPieces;
	    /* Pièce sélectionnée par le joueur du type du thème. */
		T pieceChoisie; 
		/* Pièce choisie aléatoirement par la machine du type du thème. */
		T pieceGagnante;
		/* Tableau contenant l'ensemble des pièces du plateau de jeu. */
		ArrayList<T> pieces;
		/* Service pour initialiser les différentes pièces du plateau de jeu. */
		ButeursFrancaisServices butFrServ;
		
		public Piece () {
			nomPieces=new HashMap<String,Integer>();
			for (int i = 0; i < nomPieces.size(); i++) {
				ButeursFrancais buteur = butFrServ.getById(i);
				String identite = buteur.getPrenom()+" "+buteur.getNom();
			    nomPieces.put(identite,0);
			    pieces.add((T) buteur); 
			}
			int random = (int) (1+(Math.random()*24));
			pieceGagnante = pieces.get(random);
			pieceChoisie = null;
		}

		public HashMap<String, Integer> getNomPieces() {
			return nomPieces;
		}

		public void setNomPieces(HashMap<String, Integer> nomPieces) {
			this.nomPieces = nomPieces;
		}

		public T getPieceChoisie() {
			return pieceChoisie;
		}

		public void setPieceChoisie(T pieceChoisie) {
			this.pieceChoisie = pieceChoisie;
		}

		public T getPieceGagnante() {
			return pieceGagnante;
		}

		public void setPieceGagnante(T pieceGagnante) {
			this.pieceGagnante = pieceGagnante;
		}

		public ArrayList<T> getPieces() {
			return pieces;
		}

		public void setPieces(ArrayList<T> pieces) {
			this.pieces = pieces;
		}

}
