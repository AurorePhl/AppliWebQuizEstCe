package com.projetS5.AppliWebQuizEstCe.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetS5.AppliWebQuizEstCe.Repository.ButeursFrancaisRepository;
import com.projetS5.AppliWebQuizEstCe.models.ButeursFrancais;
import com.projetS5.AppliWebQuizEstCe.services.ButeursFrancaisServices;

import lombok.Data;

@Data
@Service
public class ButFrServicesImpl implements ButeursFrancaisServices {

	@Autowired
	ButeursFrancaisRepository butRepo;
	
	@Override
	public Iterable<ButeursFrancais> getButeurs() {
		return butRepo.getButeurs();
	}
	
	@Override
	public ButeursFrancais getById(int indice) {
		return butRepo.getById(indice);
	}

}
