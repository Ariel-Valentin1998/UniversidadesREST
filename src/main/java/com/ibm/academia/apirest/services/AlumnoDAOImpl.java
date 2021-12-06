package com.ibm.academia.apirest.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ibm.academia.apirest.entities.Persona;
import com.ibm.academia.apirest.repositories.AlumnoRepository;
//import com.ibm.academia.apirest.entities.Persona;
import com.ibm.academia.apirest.repositories.PersonaRepository;
//Persona por que alumno es una persona por el tema de la herencia
@Service
//public class AlumnoDAOImpl extends GenericoDAOImpl<Persona,PersonaRepository> implements AlumnoDAO 
public class AlumnoDAOImpl extends PersonaDAOImpl implements AlumnoDAO 
{
//@Qualifier("repositorioAlumnos") hace referencia al bean que necesita de persona voy  a utilizar a alumnosrepositorio
	@Autowired 
	public AlumnoDAOImpl(@Qualifier("repositorioAlumnos")PersonaRepository repository) {
		super(repository);
	}

	@Override
	public Iterable<Persona> buscarAlumnoPorNombreCarrera(String nombre) {
		//se debe castear  por el tema de la herencia o englobado
		return ((AlumnoRepository)repository).buscarAlumnoPorNombreCarrera(nombre);
	}
}