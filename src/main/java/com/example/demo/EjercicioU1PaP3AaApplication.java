package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Matriculacion;
import com.example.demo.modelo.Vehiculo;

@SpringBootApplication
public class EjercicioU1PaP3AaApplication {
	
	@Autowired
	private Matriculacion matriculacion;
	@Autowired
	private Vehiculo vehiculo;
	

	public static void main(String[] args) {
		SpringApplication.run(EjercicioU1PaP3AaApplication.class, args);
	
		
	}

}
