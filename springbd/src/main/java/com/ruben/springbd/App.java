package com.ruben.springbd;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ruben.beans.Equipo;
import com.ruben.beans.Jugador;
import com.ruben.beans.Marca;
import com.ruben.service.ServiceJugador;
import com.ruben.service.ServiceMarca;

public class App 
{
    public static void main( String[] args )
    {
        Marca marca = new Marca();
        marca.setId(2);
        marca.setNombre("Marca2");
        
        ApplicationContext appContext = new ClassPathXmlApplicationContext("com/ruben/xml/beans.xml");
        
        ServiceMarca sm = (ServiceMarca)appContext.getBean("serviceMarcaImpl");
        ServiceJugador sj = (ServiceJugador)appContext.getBean("serviceJugadorImpl");
        
        //Equipo equipo1 = (Equipo)appContext.getBean("equipo1");
        Jugador jugador = (Jugador)appContext.getBean("jugador1");
        
        try {
        	//sm.registrar(marca);
        	sj.registrar(jugador);
        	
        } catch(Exception e) {
        	System.out.print(e.getMessage() + " - " + e.getCause() + " - " +  e.toString());
        }
        
    }
}
