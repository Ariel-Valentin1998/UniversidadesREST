package com.ibm.academia.apirest;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.ibm.academia.apirest.entities.Aula;
import com.ibm.academia.apirest.entities.Carrera;
import com.ibm.academia.apirest.entities.Persona;
import com.ibm.academia.apirest.services.AulaDAO;
import com.ibm.academia.apirest.services.CarreraDAO;
import com.ibm.academia.apirest.services.PersonaDAO;
import com.ibm.academia.apirest.services.ProfesorDAO;


@Component
public class Comandos implements CommandLineRunner    
{
	
	@Autowired 
    @Qualifier("profesorDAOImpl")
	private PersonaDAO personaDao;
	
    
	@Autowired
    private CarreraDAO carreraDao;
	@Autowired
	private AulaDAO aulaDao;
	@Override
	public void run(String... args) throws Exception 
	{
		//ingSistemas.get().getNombre()
		//Optional<Carrera> ingSistemas = carreraDao.buscarPorId(2);
        //Iterable<Persona> profesorCarrera = ((ProfesorDAO) personaDao).buscarPorProfesorNombreCarrera("Ingenieria de sistemas");
        //profesorCarrera.forEach(System.out::println);
		
		//List<Carrera> carreras = (List<Carrera>)carreraDao.findCarrerasByNombreContains("Sistemas");
        //carreras.forEach(System.out::println);
		
		//Aula aula= aulaDao.findByNumeroAula(1);
		//System.out.println(aula);
		
		//Iterable<Carrera> carreras = (Iterable<Carrera>)carreraDao.buscarCarrerasPorProfesorNombreYApellido("Ariel","De Jesús");
        //carreras.forEach(System.out::println);
        
        //Optional<Persona> persona = personaDao.buscarPorId(4);
        //System.out.println(persona);
		
	}
}