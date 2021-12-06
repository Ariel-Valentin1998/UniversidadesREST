package com.ibm.academia.apirest.services;

import java.util.Optional;
//itera una entidad <E>
public interface GenericoDAO<E> 
{
	//suplanta lo que habia en CarreraDAO para hacer más optimo el código y reutilizarlo, esto se hace por buenas prácticas ya que generas un metodo generico o una interfaz generica
	//estamos usando recursividad para reutilizar lo que ya tenemos.
	public Optional<E> buscarPorId(Integer id);
	public E guardar(E entidad);
	public Iterable<E> buscarTodos();
	public void eliminarPorId(Integer id);
}