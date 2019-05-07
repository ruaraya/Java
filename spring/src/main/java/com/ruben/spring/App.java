package com.ruben.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ruben.beans.AppConfig;
import com.ruben.beans.AppConfig2;
import com.ruben.beans.Ciudad;
import com.ruben.beans.Jugador;
import com.ruben.beans.Mundo;
import com.ruben.beans.Persona;

public class App {

	public static void main(String[] args) {
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/ruben/xml/beans.xml");
		Persona persona = (Persona) appContext.getBean(Persona.class);
		
		String nombreCiudades = "";
		
		for(Ciudad ciudad : persona.getPais().getCiudades()) {
			nombreCiudades +=ciudad.getNombre() + " - ";
		}
		
		System.out.println(persona.getId() + " " + persona.getNombre() + " " + persona.getApodo() + " " + persona.getPais().getNombre() + " " + nombreCiudades);
		
		Jugador jugador = (Jugador) appContext.getBean("messi");
		
		System.out.println(jugador.getNombre() + " - " + jugador.getEquipo().mostrar());
		
		((ConfigurableApplicationContext) appContext).close(); 
		

	}

}
