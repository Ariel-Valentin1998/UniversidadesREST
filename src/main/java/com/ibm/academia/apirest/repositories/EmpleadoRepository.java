package com.ibm.academia.apirest.repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ibm.academia.apirest.entities.Persona;
import com.ibm.academia.apirest.enums.TipoEmpleado;

@Repository("repositorioEmpleado")
public interface EmpleadoRepository extends PersonaRepository {
	
	@Query(value = "select* from universidad.empleados e where upper(e.tipo_empleado) like upper(%?1%)", nativeQuery = true)
	public Iterable<Persona> findEmpleadoByTipoEmpleado(TipoEmpleado tipoEmpleado);

}
