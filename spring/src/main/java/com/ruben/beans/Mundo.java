package com.ruben.beans;

import org.springframework.beans.factory.annotation.Value;

public class Mundo {
	
	@Value("Hola mundo")
	private String saludo;

	public String getSaludo() {
		return saludo;
	}

	public void setSaludo(String saludo) {
		this.saludo = saludo;
	}
	

}
