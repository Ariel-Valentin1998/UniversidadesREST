package com.ibm.academia.apirest.services;

import com.ibm.academia.apirest.entities.Aula;
import com.ibm.academia.apirest.entities.Pabellon;
import com.ibm.academia.apirest.enums.Pizarron;

public interface AulaDAO extends GenericoDAO<Aula>{

	public Iterable<Aula> findAulasByPizarron(Pizarron pizarron);
	
	public Iterable<Aula> findAulasByPabellon(Pabellon pabellon);
	
	public Aula findByNumeroAula(Integer numeroAula);
}