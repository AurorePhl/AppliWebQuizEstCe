package com.projetS5.AppliWebQuizEstCe.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.projetS5.AppliWebQuizEstCe.CustomProperties;
import com.projetS5.AppliWebQuizEstCe.models.Res;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ReponseRepository {

	@Autowired
    private CustomProperties props;

	public Iterable<Res> getReponses() {
		String baseApiUrl = (String) props.getApiUrl();
        String getResUrl = baseApiUrl + "/res";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Iterable<Res>> response = restTemplate.exchange(
                getResUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Iterable<Res>>() {}
                );
        return response.getBody();
	}

	public Res getReponseById(int identifiant) {
		String baseApiUrl = (String) props.getApiUrl();
        String getResUrl = baseApiUrl + "/res/"+identifiant;
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Res> response = restTemplate.exchange(
                getResUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Res>() {}
                );
        return response.getBody();
	}
	
}
