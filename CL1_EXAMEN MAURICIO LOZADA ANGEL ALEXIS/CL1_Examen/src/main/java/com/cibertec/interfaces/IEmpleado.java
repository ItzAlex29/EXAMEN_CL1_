package com.cibertec.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.model.Empleado;

@Repository
public interface IEmpleado extends CrudRepository<Empleado, String> {

}
