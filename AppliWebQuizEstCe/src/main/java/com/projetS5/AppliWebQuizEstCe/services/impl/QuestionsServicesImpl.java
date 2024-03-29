package com.projetS5.AppliWebQuizEstCe.services.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetS5.AppliWebQuizEstCe.Repository.QuestionsRepository;
import com.projetS5.AppliWebQuizEstCe.models.Questions;
import com.projetS5.AppliWebQuizEstCe.services.QuestionsServices;

import lombok.Data;

@Data
@Service
public class QuestionsServicesImpl implements QuestionsServices {

	@Autowired
    private QuestionsRepository questionsRepo;

    public Questions getQuestion(final int id) {
        return questionsRepo.getQuestion(id);
    }

    public List<Questions> getQuestions() {
        return questionsRepo.getQuestions();
    }

	@Override
	public Collection<? extends String> getMotCle() {
		return (Collection<? extends String>) questionsRepo.getMotCles();
	}

}
