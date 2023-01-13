package com.projetS5.AppliWebQuizEstCe.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetS5.AppliWebQuizEstCe.Repository.ReponseRepository;
import com.projetS5.AppliWebQuizEstCe.models.Res;
import com.projetS5.AppliWebQuizEstCe.services.ReponseServices;

import lombok.Data;

@Data
@Service
public class ReponseServicesImpl implements ReponseServices {

	@Autowired
	ReponseRepository resRepo;
	
	@Override
	public Iterable<Res> getReponses() {
		return resRepo.getReponses();
	}

	@Override
	public Res getReponseById(int identifiant) {
		return resRepo.getReponseById(identifiant);
	}

}
