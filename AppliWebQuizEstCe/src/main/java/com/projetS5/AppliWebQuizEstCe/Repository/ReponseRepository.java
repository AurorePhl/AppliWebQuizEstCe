package com.projetS5.AppliWebQuizEstCe.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.projetS5.AppliWebQuizEstCe.CustomProperties;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class ReponseRepository {

	@Autowired
    private CustomProperties props;
	
}
