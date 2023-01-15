package com.projetS5.AppliWebQuizEstCe.models;

import java.util.ArrayList;
import java.util.HashMap;

public class QuestionsPosees {

	private HashMap<String, ArrayList<Questions>> questions; 
    private int currentQuestionIndex; 
    private String currentTheme; 

    public QuestionsPosees() { 
    questions = new HashMap<String, ArrayList<Questions>>(); 
    currentQuestionIndex = 0; 
    currentTheme = ""; 
    } 

    public void addQuestion(String theme, Questions question) { 
    if (!questions.containsKey(theme)) 
            questions.put(theme, new ArrayList <Questions>()); 
    questions.get(theme).add(question);
     } 

    public void setCurrentTheme(String theme) {
     currentTheme = theme;
     currentQuestionIndex = 0;
     }
    public ArrayList<Questions> getQuestions(){ 
        return questions.get(currentTheme);
     }

    public Questions getCurrentQuestion() { 
        return questions.get(currentTheme).get(currentQuestionIndex); 
    } 
    public boolean checkAnswer(String answer) { 
        return answer.equalsIgnoreCase(getAnswer());
    }

    private String getAnswer() {
        // TODO Auto-generated method stub
        return null;
    }

	public int getCurrentQuestionIndex() {
		return currentQuestionIndex;
	}

	public void setCurrentQuestionIndex(int currentQuestionIndex) {
		this.currentQuestionIndex = currentQuestionIndex;
	}

	public String getCurrentTheme() {
		return currentTheme;
	}

	public void setQuestions(HashMap<String, ArrayList<Questions>> questions) {
		this.questions = questions;
	}
    
}
