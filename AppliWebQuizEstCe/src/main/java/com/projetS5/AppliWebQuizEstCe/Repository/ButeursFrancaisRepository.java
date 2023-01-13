package com.projetS5.AppliWebQuizEstCe.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import com.projetS5.AppliWebQuizEstCe.CustomProperties;
import com.projetS5.AppliWebQuizEstCe.models.ButeursFrancais;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ButeursFrancaisRepository {

	@Autowired
    private CustomProperties props;

	public Iterable<ButeursFrancais> getButeurs(){
		String baseApiUrl = (String) props.getApiUrl();
        String getButeursUrl = baseApiUrl + "/buteursFrancais";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Iterable<ButeursFrancais>> response = restTemplate.exchange(
                getButeursUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<Iterable<ButeursFrancais>>() {}
                );
        return response.getBody();
	}
	
	public ButeursFrancais getById(int indice) {
		String baseApiUrl = (String) props.getApiUrl();
		String getButeursUrl = baseApiUrl + "/buteursFrancais/" + indice;
		RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<ButeursFrancais> response = restTemplate.exchange(
                getButeursUrl,
                HttpMethod.GET,
                null,
                new ParameterizedTypeReference<ButeursFrancais>() {}
                );
        return response.getBody();
	}
	
}
