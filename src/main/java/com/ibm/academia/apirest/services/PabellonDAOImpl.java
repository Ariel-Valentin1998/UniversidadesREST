package com.ibm.academia.apirest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.academia.apirest.entities.Direccion;
import com.ibm.academia.apirest.entities.Pabellon;
import com.ibm.academia.apirest.repositories.PabellonRepository;

@Service
public class PabellonDAOImpl extends GenericoDAOImpl<Pabellon, PabellonRepository> implements PabellonDAO {

	@Autowired
	public PabellonDAOImpl(PabellonRepository repository) {
		super(repository);
	}

	@Override
	public Iterable<Pabellon> findPabellonesByDireccion(Direccion direccion) {
	
		return repository.findPabellonesByDireccion(direccion);
	}

	@Override
	public Iterable<Pabellon> findPabellonesByNombreContainsIgnoreCase(String nombre) {
		
		return repository.findPabellonesByNombreContainsIgnoreCase(nombre);
	}

	
}
