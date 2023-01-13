package com.projetS5.AppliWebQuizEstCe.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.projetS5.AppliWebQuizEstCe.models.MotCles;
import com.projetS5.AppliWebQuizEstCe.models.Piece;
import com.projetS5.AppliWebQuizEstCe.models.Questions;
import com.projetS5.AppliWebQuizEstCe.models.Res;
import com.projetS5.AppliWebQuizEstCe.models.Theme;

@Controller
public class GameController {

	Questions questions;
	String questionChoisie;
	MotCles motCleChoisi;
	Piece plateau;
	Res res;
	Theme theme;
	
	@GetMapping("/WindowQuestion")
	public void AffichePieceQuestion(Model model) {
		plateau = new Piece();
		theme = new Theme();
		for(int i =0; i<plateau.getIdentitePieces().size();i++) {
			String id = (String) plateau.getIdentitePieces().get(i);
			theme.addTheme(id, plateau);
			model.addAttribute("identite", id);
		}
	}
	
	@GetMapping("/WindowKeyword")
	public void AffichePieceKeyword(Model model) {
		plateau = new Piece();
		theme = new Theme();
		for(int i =0; i<plateau.getIdentitePieces().size();i++) {
			String id = (String) plateau.getIdentitePieces().get(i);
			theme.addTheme(id, plateau);
			model.addAttribute("identite", id);
		}
	}
	
	public void ChoixQuestion() {
		/* début dans WindowQuestion
		 * Choix question (clique sur bouton) 
		-> Ajout dans questions posées 
		-> obtenir pièces concernées grâce aux réponses   
		-> pièces concernées grisées (value replace à 1 dans nomPieces) 
		redirect vers WindowKeyWord 
		si plus qu'une pièce -> Victory() */
	}
	
	public void ChoixMotCle() {
		/* début dans WindowKeyword
		 * Choix motCle (clique sur bouton)  
		 * -> Ajout value +1 dans map motclés  
		 * -> récupérer questions associées  
		 * -> redirect vers WindowQuestion*/ 
	}
	
	public void ChoixPiece() {
		/* (début dans WindowPiece ou bien (WindowKeyword ou WindowQuestion))
		 * Choix pièce (changer valeur de PièceChoisie) 
		 * -> Pièces concernées grisées (value replace à 1 dans nomPieces) 
		 * -> Victory() */
	}
	
	public void Victory() {
		/* Si pieceChoisie identique à pieceGagnante 
		 * -> redirect vers WindowVictory 
		 * -> le joueur clique sur "suivant" 
		 * -> redirection vers page d'accueil
		 * Sinon 
		 * -> pieceChoisie : piece grisée (value replace à 1 dans nomPieces correspondant) */
	}
}
