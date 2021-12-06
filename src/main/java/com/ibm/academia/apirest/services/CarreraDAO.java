package com.ibm.academia.apirest.services;

import com.ibm.academia.apirest.entities.Carrera;
//se extiende de Generico.DAO y se le pasa la entidad carrera
public interface CarreraDAO extends GenericoDAO<Carrera>
{
	public Iterable<Carrera> findCarrerasByCantidadAnios(Integer cantidadAnios);
	public Iterable<Carrera> findCarrerasByNombreContains(String nombre);
	public Iterable<Carrera> findCarrerasByNombreContainsIgnoreCase(String nombre);
	public Iterable<Carrera> findCarrerasByCantidadAniosAfter(Integer cantidadAnios); 
	public Iterable<Carrera> buscarCarrerasPorProfesorNombreYApellido(String nombre, String apellido);
}