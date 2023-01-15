package com.projetS5.AppliWebQuizEstCe.Controller;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.projetS5.AppliWebQuizEstCe.models.MotCles;
import com.projetS5.AppliWebQuizEstCe.models.Piece;
import com.projetS5.AppliWebQuizEstCe.models.Questions;
import com.projetS5.AppliWebQuizEstCe.models.QuestionsPosees;
import com.projetS5.AppliWebQuizEstCe.models.Res;
import com.projetS5.AppliWebQuizEstCe.models.Theme;
import com.projetS5.AppliWebQuizEstCe.services.QuestionsServices;

@Controller
public class GameController {

	private Questions question;
	private LinkedList<Questions> questions;
	private QuestionsServices qServ;
	private String questionChoisie;
	private MotCles motCleChoisi;
	private Piece plateau;
	private Res res;
	private Theme theme;
	QuestionsPosees questionP;
	
	@GetMapping("/")
	public String AfficheQuestion(Model model) {
		questions = (LinkedList<Questions>) qServ.getQuestions();
		LinkedList<Questions> qMc = new LinkedList<Questions>();
		int taille = questions.size();
		for(int i =0; i<taille;i++) {
			if(questions.get(i).getMotCle().equals(motCleChoisi.getMotCleChoisi()))
				qMc.add(questions.get(i));
		}
		for(int i =0; i<qMc.size();i++) {
			model.addAttribute("question", qMc.get(i));
		}
		return "WindowKeyword";
	}
	
	@GetMapping("/")
	public String AfficheKeyword(Model model) {
		motCleChoisi = new MotCles();
		TreeSet<String> mc = (TreeSet<String>) motCleChoisi.getStockMotCles().clone();
		int taille = mc.size();
		for(int i =0; i<taille;i++) {
			model.addAttribute("keyword", mc.first());
			mc.remove(mc.first());
		}
		return "WindowQuestion";
	}
	
	// Affichage des questions restantes 
	/*public void showRemainingQuestions() {
	        	List<Questions> remainingQuestions = questionP.getRemainingQuestions();
	        	view.displayRemainingQuestions(remainingQuestions);
	    }

	 public void handleQuestionSelection() {
	        List<Questions> questions = qServ.getQuestions();
	        view.displayQuestions(questions);
	        int selectedQuestionIndex = view.getSelectedQuestionIndex();
	        QuestionsPosees.selectedQuestion = questions.get(selectedQuestionIndex);
	        questionP.setCurrentQuestion(selectedQuestion.getQuestion());
	        view.displayCurrentQuestion(selectedQuestion);

	        // Partie pour griser les pièces concernées 
	        List<Piece> pieces = plateau.getPieces();
	        List<Piece> grayedOutPieces = plateau.getPiecesBasedOnAnswer(selectedQuestion.getAnswer());
	        view.grayOutPieces(grayedOutPieces);
	    }*/
	 
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
	
	@GetMapping("/")
	public String Victory(Model model) {
		/* Après ChoixPiece() 
		 * Si pieceChoisie identique à pieceGagnante 
		 * -> affichage
		 * -> le joueur clique sur "suivant" 
		 * -> redirection vers page d'accueil */
		if(plateau.getPieceChoisie().equals(plateau.getPieceGagnante())) {
			model.addAttribute("victory", "Victoire");
		}
		else {
			model.addAttribute("victory", "Perdu");
		}
		return "WindowHome";
	}
}
