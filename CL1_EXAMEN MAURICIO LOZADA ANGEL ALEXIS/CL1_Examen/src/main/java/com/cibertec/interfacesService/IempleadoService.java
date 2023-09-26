package com.cibertec.interfacesService;

import java.util.List;
import java.util.Optional;

import com.cibertec.model.Empleado;

public interface IempleadoService {
	public List<Empleado>listar();
	public Optional<Empleado>listarId(int id);
	public int guardar(Empleado p);
	public void delete(int id);
}
