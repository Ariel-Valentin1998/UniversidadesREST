package com.ibm.academia.apirest.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.apirest.entities.Carrera;
//CrudRepository<Carrera, Integer>, PagingAndSortingRepository, JpaRepositoyry, existen tres y se adecuan a lo que necesites

@Repository
//pide dos parametros el objeto Carrera , id o Integer es el tipo de dato del id del objeto
public interface CarreraRepository extends CrudRepository<Carrera, Integer>
{
	    //@Query("select c from Carrera c where c.cantidadAnios =?1")
	    //Spring Data
		public Iterable<Carrera> findCarrerasByCantidadAnios(Integer cantidadAnios);
		
		//@Query("select c from Carrera c where c.nombre  like %?1%")
		public Iterable<Carrera> findCarrerasByNombreContains(String nombre);
		
		//@Query("select c from Carrera c where upper(c.nombre)  like upper(%?1%)")
		public Iterable<Carrera> findCarrerasByNombreContainsIgnoreCase(String nombre);
		
		//@Query("select c from Carrera c where c.cantidadAnios > ?1 ")
		public Iterable<Carrera> findCarrerasByCantidadAniosAfter(Integer cantidadAnios); 
		
		@Query(value = "select* from universidad.profesor_carrera pc "
				+ "inner join universidad.personas pe on pe.id=pc.profesor_id "
				+ "inner join universidad.carreras c on c.id=pc.carrera_id "
				+ "where upper(pe.nombre) like upper(%?1%) and upper(pe.apellido) like upper(%?2%);"
				, nativeQuery = true)
		public Iterable<Carrera> buscarCarrerasPorProfesorNombreYApellido(String nombre, String apellido);
		
}

