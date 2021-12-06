package com.ibm.academia.apirest.services;

import com.ibm.academia.apirest.entities.Direccion;
import com.ibm.academia.apirest.entities.Pabellon;

public interface PabellonDAO extends GenericoDAO<Pabellon>{
	
	public Iterable<Pabellon> findPabellonesByDireccion(Direccion direccion);
	
	public Iterable<Pabellon> findPabellonesByNombreContainsIgnoreCase(String nombre);

}
