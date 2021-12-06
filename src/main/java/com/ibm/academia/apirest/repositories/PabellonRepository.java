package com.ibm.academia.apirest.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ibm.academia.apirest.entities.Direccion;
import com.ibm.academia.apirest.entities.Pabellon;

@Repository
public interface PabellonRepository extends CrudRepository<Pabellon, Integer>{

    //@Query(value = "select* from universidad.pabellones p where upper(p.localidad) like upper(=?1)", nativeQuery = true)
	public Iterable<Pabellon> findPabellonesByDireccion(Direccion direccion);
	//@Query(value = "select* from universidad.pabellones p where upper(p.nombre) like upper('%b%')", nativeQuery = true)
	public Iterable<Pabellon> findPabellonesByNombreContainsIgnoreCase(String nombre);

	

}
