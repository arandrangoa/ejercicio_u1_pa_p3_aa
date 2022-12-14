package com.example.demo.repository;

import com.example.demo.modelo.Vehiculo;

public interface IVehiculoRepository {
	
	public void crear(Vehiculo vehiculo);
	public void eliminar(Vehiculo vehiculo);
	public void buscar(String placa);
	public void actualziar(Vehiculo vechiculo);
	
}
