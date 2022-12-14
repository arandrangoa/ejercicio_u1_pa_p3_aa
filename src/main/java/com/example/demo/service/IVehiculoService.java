package com.example.demo.service;

import java.math.BigDecimal;

import com.example.demo.modelo.Vehiculo;

public interface IVehiculoService {
	
	public Vehiculo crear(String marca, String placa, String tipo, BigDecimal precio);

}
