package com.example.demo.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IVehiculoRepository;
@Service
public class VehiculoServiceImpl implements IVehiculoService{
	
	@Autowired
	private IVehiculoRepository iVehiculoRepository;

	@Override
	public Vehiculo crear(String marca, String placa, String tipo, BigDecimal precio) {
		// TODO Auto-generated method stub
		Vehiculo v=this.crear(marca, placa, tipo, precio);
		v.setMarca(marca);
		v.setPlaca(placa);
		v.setPrecio(precio);
		v.setTipo(tipo);
		return v;
		
	}

}
