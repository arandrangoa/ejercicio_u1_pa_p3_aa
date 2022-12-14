package com.example.demo.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Vehiculo;
@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository{
	
	public static List<Vehiculo> baseDeDatos=new ArrayList<>();

	@Override
	public void crear(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("Se crea el vehiculo: "+ vehiculo);
		this.baseDeDatos.add(vehiculo);
		
	}

	@Override
	public void eliminar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		this.baseDeDatos.remove(vehiculo);
		
	}

	@Override
	public void buscar(String placa) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void actualziar(Vehiculo vehiculo) {
		// TODO Auto-generated method stub
		System.out.println("Se actualiza el vehiculo: "+vehiculo);
		
	}

}
