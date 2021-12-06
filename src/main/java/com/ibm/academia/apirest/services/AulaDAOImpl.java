package com.ibm.academia.apirest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.academia.apirest.entities.Aula;
import com.ibm.academia.apirest.entities.Pabellon;
import com.ibm.academia.apirest.enums.Pizarron;
import com.ibm.academia.apirest.repositories.AulaRepository;
@Service
public class AulaDAOImpl extends  GenericoDAOImpl<Aula, AulaRepository> implements AulaDAO{
    @Autowired
	public AulaDAOImpl(AulaRepository repository) {
		super(repository);
		
	}

	@Override
	public Iterable<Aula> findAulasByPizarron(Pizarron pizarron) {
		
		return repository.findAulasByPizarron(pizarron);
	}

	@Override
	public Iterable<Aula> findAulasByPabellon(Pabellon pabellon) {
		
		return repository.findAulasByPabellon(pabellon);
	}

	@Override
	public Aula findByNumeroAula(Integer numeroAula) {
		
		return repository.findByNumeroAula(numeroAula);
	}

}
