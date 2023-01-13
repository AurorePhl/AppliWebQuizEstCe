package com.projetS5.AppliWebQuizEstCe.models;

import java.util.ArrayList;
import java.util.HashMap;

import com.projetS5.AppliWebQuizEstCe.services.ButeursFrancaisServices;

public class Piece<T> {
        /* Map contenant les pieces du plateau de jeu associées à une valeur binaire.
         * 1 veut dire que la pièce est grisée 
         * 0 veut dire que la pièce n'est pas grisée
         * Chaque clé est une chaine de caractère contenant le nom et le prénom de chacun des buteurs français. */
	    HashMap<String,Integer> cptPieces;
	    /* Pièce sélectionnée par le joueur du type du thème. */
		T pieceChoisie; 
		/* Pièce choisie aléatoirement par la machine du type du thème. */
		T pieceGagnante;
		/* Liste contenant l'ensemble des pièces du plateau de jeu. */
		ArrayList<T> pieces;
		/* Liste contenant l'ensemble des noms et prénoms des pièces. */
		ArrayList<String> identitePieces;
		/* Service pour initialiser les différentes pièces du plateau de jeu. */
		ButeursFrancaisServices butFrServ;
		
		public Piece () {
			cptPieces=new HashMap<String,Integer>();
			pieces = new ArrayList<T>();
			identitePieces = new ArrayList<String>();
			for (int i = 0; i < cptPieces.size(); i++) {
				ButeursFrancais buteur = butFrServ.getById(i);
				String identite = buteur.getPrenom()+" "+buteur.getNom();
				cptPieces.put(identite,0);
				identitePieces.add(identite);
			    pieces.add((T) buteur); 
			}
			int random = (int) (1+(Math.random()*24));
			pieceGagnante = pieces.get(random);
			pieceChoisie = null;
		}

		public ArrayList<String> getIdentitePieces() {
			return identitePieces;
		}

		public void setIdentitePieces(ArrayList<String> identitePieces) {
			this.identitePieces = identitePieces;
		}

		public HashMap<String, Integer> getCtPiecess() {
			return cptPieces;
		}

		public void setCptPieces(HashMap<String, Integer> nomPieces) {
			this.cptPieces = nomPieces;
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
