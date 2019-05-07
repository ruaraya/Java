package com.ruben.beans;

import org.springframework.beans.factory.annotation.Required;

import com.ruben.interfaces.IEquipo;

public class Jugador {
	
	private int numero;
	private String nombre;
	private IEquipo equipo;
	
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	@Required
	public IEquipo getEquipo() {
		return equipo;
	}
	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}

}
