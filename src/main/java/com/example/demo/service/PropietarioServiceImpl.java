package com.example.demo.service;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Propietario;
import com.example.demo.repository.IPropietarioRepository;
@Service
public class PropietarioServiceImpl implements IPropietarioService {
	
	@Autowired
	private IPropietarioRepository iPropietarioRepository;

	@Override
	public Propietario crear(String nombre, String Apellido, String cedula, LocalDateTime fecha) {
		// TODO Auto-generated method stub
		Propietario p=this.crear(nombre, Apellido, cedula, fecha);
		p.setApellido(Apellido);
		p.setCedula(cedula);
		p.setFechaNacimiento(fecha);
		p.setNombre(nombre);
		return p;
	}

}
