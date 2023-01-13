package com.projetS5.AppliWebQuizEstCe.services;

import com.projetS5.AppliWebQuizEstCe.models.Res;

public interface ReponseServices {

	public Iterable<Res> getReponses();
	public Res getReponseById(int identifiant);
	
}
