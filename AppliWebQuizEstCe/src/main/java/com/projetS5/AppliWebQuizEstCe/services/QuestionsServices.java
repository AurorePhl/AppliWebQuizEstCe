package com.projetS5.AppliWebQuizEstCe.services;

import java.util.Collection;
import java.util.List;

import com.projetS5.AppliWebQuizEstCe.models.Questions;

public interface QuestionsServices {

	public Questions getQuestion(final int id);
	
	public List<Questions> getQuestions();

	public Collection<? extends String> getMotCle();
}
