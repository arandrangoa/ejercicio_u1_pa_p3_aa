package com.example.demo.modelo;

import java.time.LocalDateTime;

public class Matriculacion {
	
	private LocalDateTime fechaMatricualcion;
	private Integer valor;
	private Propietario propietario;
	private Vehiculo vechiculo;
	
	@Override
	public String toString() {
		return "Matriculacion [fechaMatricualcion=" + fechaMatricualcion + ", valor=" + valor + ", propietario="
				+ propietario + ", vechiculo=" + vechiculo + "]";
	}
	//GET Y SET
	public LocalDateTime getFechaMatricualcion() {
		return fechaMatricualcion;
	}
	public void setFechaMatricualcion(LocalDateTime fechaMatricualcion) {
		this.fechaMatricualcion = fechaMatricualcion;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	public Propietario getPropietario() {
		return propietario;
	}
	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}
	public Vehiculo getVechiculo() {
		return vechiculo;
	}
	public void setVechiculo(Vehiculo vechiculo) {
		this.vechiculo = vechiculo;
	}
	
	

}
