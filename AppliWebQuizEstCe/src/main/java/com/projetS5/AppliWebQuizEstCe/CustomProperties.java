package com.projetS5.AppliWebQuizEstCe;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import lombok.Data;

@Data
@Configuration
@ConfigurationProperties(prefix="com.projets5.appliwebquizestce")
public class CustomProperties {
	
	private String apiUrl;

	public Object getApiUrl() {
		return apiUrl;
	}

	public void setApiUrl(String apiUrl) {
		this.apiUrl = apiUrl;
	}
	
	

}
