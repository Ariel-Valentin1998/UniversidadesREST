package com.ibm.academia.apirest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ibm.academia.apirest.entities.Carrera;
import com.ibm.academia.apirest.repositories.CarreraRepository;

@Service
//public class CarreraDAOImpl implements CarreraDAO 
public class CarreraDAOImpl extends GenericoDAOImpl<Carrera, CarreraRepository> implements CarreraDAO 
{
	@Autowired
	//se implemanta el constructor de CarreraDAOImpl que le dona por herencia GenericoDAOImpl
	public CarreraDAOImpl(CarreraRepository repository) {
		super(repository);
	}

	@Override
	public Iterable<Carrera> findCarrerasByCantidadAnios(Integer cantidadAnios) {
			return repository.findCarrerasByCantidadAnios(cantidadAnios);
	}

	@Override
	public Iterable<Carrera> findCarrerasByNombreContains(String nombre) {
		return repository.findCarrerasByNombreContains(nombre);
	}

	@Override
	public Iterable<Carrera> findCarrerasByNombreContainsIgnoreCase(String nombre) {
		return repository.findCarrerasByNombreContainsIgnoreCase(nombre);
	}

	@Override
	public Iterable<Carrera> findCarrerasByCantidadAniosAfter(Integer cantidadAnios) {
		return repository.findCarrerasByCantidadAniosAfter(cantidadAnios);
	}

	@Override
	public Iterable<Carrera> buscarCarrerasPorProfesorNombreYApellido(String nombre, String apellido) {
		
		return repository.buscarCarrerasPorProfesorNombreYApellido(nombre, apellido);
	}
}