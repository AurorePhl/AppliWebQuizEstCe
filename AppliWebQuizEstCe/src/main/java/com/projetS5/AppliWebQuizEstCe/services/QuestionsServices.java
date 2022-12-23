package com.projetS5.AppliWebQuizEstCe.services;

import com.projetS5.AppliWebQuizEstCe.models.Questions;

public interface QuestionsServices {

	public Questions getQuestion(final int id);
	
	public Iterable<Questions> getQuestions();
}
