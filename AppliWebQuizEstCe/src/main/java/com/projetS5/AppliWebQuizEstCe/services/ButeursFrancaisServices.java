package com.projetS5.AppliWebQuizEstCe.services;

import com.projetS5.AppliWebQuizEstCe.models.ButeursFrancais;

public interface ButeursFrancaisServices {

	public Iterable<ButeursFrancais> getButeurs();
	public ButeursFrancais getById(int indice);
}
