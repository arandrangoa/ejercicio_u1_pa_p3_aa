package com.example.demo.repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Propietario;
@Repository
public class PropietarioRepositoryImpl implements IPropietarioRepository{
	
	public static List<Propietario> baseDeDatos=new ArrayList<>();

	@Override
	public void crear(Propietario propietario) {
		// TODO Auto-generated method stub
		System.out.println("Se crea el propietario: "+propietario);
		this.baseDeDatos.add(propietario);
		
	}

	@Override
	public void eliminar(String cedula) {
		// TODO Auto-generated method stub
		System.out.println("Se elimina el propietario con cedula:"+cedula);
		this.baseDeDatos.remove(cedula);
		
	}



}
