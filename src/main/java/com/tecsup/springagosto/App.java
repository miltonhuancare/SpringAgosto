package com.tecsup.springagosto;

import com.tecsup.springagosto.beans.model.Instrumento;
import com.tecsup.springagosto.beans.model.Musico;
import com.tecsup.springagosto.beans.model.Persona;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class App {

    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        Persona persona = (Persona) context.getBean("persona");
        
        System.out.println(persona.getNombres());
        
        
        Musico musico = new Musico();
        musico.getInstrumento();
        
        
    }
}
