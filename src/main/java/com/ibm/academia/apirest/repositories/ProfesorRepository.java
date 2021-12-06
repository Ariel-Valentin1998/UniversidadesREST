package com.ibm.academia.apirest.repositories;



import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.ibm.academia.apirest.entities.Persona;


@Repository("repositorioProfesores")
public interface ProfesorRepository extends PersonaRepository
{
	
	//@Query("select p from Profesor p join fetch p.carrera c where upper(c.nombre) like upper(%?1%)")
	//@Query("select p from Profesor p join fetch p.carreras c where upper(c.nombre) like upper(%?1%)")
	@Query(value = "select* from universidad.carreras c inner join universidad.profesor_carrera pc on pc.carrera_id = c.id inner join universidad.profesores p on p.persona_id=pc.profesor_id where upper(c.nombre) like upper(%?1%)", nativeQuery = true)
	public Iterable<Persona> buscarPorProfesorNombreCarrera(String nombre);
	 
}
