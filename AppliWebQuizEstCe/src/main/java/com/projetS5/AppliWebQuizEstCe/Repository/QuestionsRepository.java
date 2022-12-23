package com.projetS5.AppliWebQuizEstCe.Repository;

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

       //log.debug("Get Questions call " + response.getStatusCode().toString());
        
        return response.getBody();
    }

	/*public Questions getQuestion(int id) {
		// TODO Auto-generated method stub
		return null;
	}*/
	
	public Iterable<String> getMotCles(){
		//à faire
		return null;
	}
}
