package com.example.demo.service;

import java.time.LocalDateTime;

import com.example.demo.modelo.Propietario;

public interface IPropietarioService {
	public Propietario crear(String nombre, String Apellido, String cedula, LocalDateTime fecha);

}
