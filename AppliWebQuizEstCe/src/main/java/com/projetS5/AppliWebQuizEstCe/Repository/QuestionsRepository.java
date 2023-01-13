package com.projetS5.AppliWebQuizEstCe.Repository;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.projetS5.AppliWebQuizEstCe.CustomProperties;
import com.projetS5.AppliWebQuizEstCe.models.Questions;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class QuestionsRepository {
	
	@Autowired
    private CustomProperties props;

    public Iterable<Questions> getQuestions() {
        String baseApiUrl = (String) props.getApiUrl();
        String getQuestionsUrl = baseApiUrl + "/questions";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Iterable<Questions>> response = restTemplate.exchange(
                getQuestionsUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Iterable<Questions>>() {}
                );
        return response.getBody();
    }

	public Questions getQuestion(int id) {
		String baseApiUrl = (String) props.getApiUrl();
        String getQuestionUrl = baseApiUrl + "/questions/" + id;
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Questions> response = restTemplate.exchange(
                getQuestionUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Questions>() {}
                );
		return response.getBody();
	}
	
	public Collection<? extends String> getMotCles(){
		String baseApiUrl = (String) props.getApiUrl();
        String getmcUrl = baseApiUrl + "/questions/mc";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Collection<? extends String>> response = restTemplate.exchange(
                getmcUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Collection<? extends String>>() {}
                );
		return response.getBody();
	}
}
