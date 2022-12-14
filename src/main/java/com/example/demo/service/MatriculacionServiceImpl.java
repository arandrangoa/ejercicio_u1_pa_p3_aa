package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Matriculacion;
import com.example.demo.repository.IMatriculacionRepository;
import com.example.demo.repository.IPropietarioRepository;
import com.example.demo.repository.IVehiculoRepository;

@Service
public class MatriculacionServiceImpl implements IMatriculacionService{
	
	@Autowired
	private IMatriculacionRepository iMatriculacionRepository;
	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	@Autowired
	private IPropietarioRepository iPropietarioRepository;
	

	@Override
	public Matriculacion crear(String cedula, String placa) {
		// TODO Auto-generated method stub
		Matriculacion m=this.crear(cedula, placa);
		return m;
	}

}
