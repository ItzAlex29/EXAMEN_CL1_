package com.cibertec.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.interfaces.IEmpleado;
import com.cibertec.interfacesService.IempleadoService;
import com.cibertec.model.Empleado;

@Service
public class EmpleadoService implements IempleadoService{
    
	@Autowired
	private IEmpleado data;
	
	@Override
	public List<Empleado> listar() {
		return (List<Empleado>)data.findAll();
	}

	@Override
	public Optional<Empleado> listarId(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int guardar(Empleado p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
