package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Matriculacion;
import com.example.demo.modelo.Propietario;
@Repository
public class MatriculacionRepositoryImpl implements IMatriculacionRepository{
	
	public static List<Matriculacion> baseDeDatos=new ArrayList<>();

	@Override
	public void crear(Matriculacion matricula) {
		// TODO Auto-generated method stub
		System.out.println("Se creo la matricula: "+matricula);
		this.baseDeDatos.add(matricula);
	}

	@Override
	public void actualizar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminar(Matriculacion matricula) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buscar(Propietario propietario) {
		// TODO Auto-generated method stub
		
	}

}
