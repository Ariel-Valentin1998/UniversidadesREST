package com.ibm.academia.apirest.services;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

//extends de crud 
//resive dos argumentos<E,R extends CrudRepository<E, Integer>> la E es de Entidad GenericoDAO(hace referencia a todos los DAO relacionados por la herencia)
//La R es de repositorio y que ese repositorio extienda de CrudRepository. 
//CrudRepository<E, Integer> E de la entidad y Integer es el id (TODAS LAS entidades tienen el mismo tipo de dato Integer)
//cual es la entidad y cual es el repositorio

public class GenericoDAOImpl <E, R extends CrudRepository<E, Integer>> implements GenericoDAO<E>
{
	//se crea una variable del repositorio
	protected final R repository;
	//se crea un constructor para inisializarla
	public GenericoDAOImpl(R repository)
	{
		this.repository = repository;
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<E> buscarPorId(Integer id) 
	{
		return repository.findById(id);
	}

	@Override
	@Transactional
	public E guardar(E entidad) 
	{
		return repository.save(entidad);
	}

	@Override
	@Transactional(readOnly = true)
	public Iterable<E> buscarTodos() 
	{
		return repository.findAll();
	}

	@Override
	@Transactional
	public void eliminarPorId(Integer id) 
	{
		repository.deleteById(id);
	}
}