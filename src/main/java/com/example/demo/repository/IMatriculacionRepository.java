package com.example.demo.repository;

import com.example.demo.modelo.Matriculacion;
import com.example.demo.modelo.Propietario;

public interface IMatriculacionRepository {
	
	public void crear(Matriculacion matricula);
	public void eliminar(Matriculacion matricula);
	public void buscar(Propietario propietario);
	public void actualizar();
	
	

}
