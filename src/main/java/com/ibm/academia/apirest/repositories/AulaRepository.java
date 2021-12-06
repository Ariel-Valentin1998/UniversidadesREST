package com.ibm.academia.apirest.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.apirest.entities.Aula;
import com.ibm.academia.apirest.entities.Pabellon;
import com.ibm.academia.apirest.enums.Pizarron;


@Repository
public interface AulaRepository extends CrudRepository<Aula, Integer>{
	
	//@Query(value = "select* from universidad.aulas where upper(tipo_pizarron) = upper(?1);", nativeQuery = true)
	public Iterable<Aula> findAulasByPizarron(Pizarron pizarron);
	//@Query(value = "select* from universidad.aulas a inner join universidad.pabellones p on p.id = a.pabellon_id where upper(p.nombre) = upper(?1);", nativeQuery = true)
	public Iterable<Aula> findAulasByPabellon(Pabellon pabellon);
	//@Query(value = "select* from universidad.aulas a where a.numero_aula=?1", nativeQuery = true)
	public Aula findByNumeroAula(Integer numeroAula);
	

}
