package com.tecsup.springagosto.beans;

import com.tecsup.springagosto.beans.model.Instrumento;
import com.tecsup.springagosto.beans.model.Musico;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppBean {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        AppBean.autoWire(context);
    }

    public static void autoWire(ApplicationContext context) {
        Musico noel = (Musico) context.getBean("noel");
        System.out.println(noel.getInstrumento().getMarca());

        Musico cerati = (Musico) context.getBean("cerati");
        System.out.println(cerati.getInstrumento().getMarca());
        
        Musico charly = (Musico) context.getBean("charly");
        System.out.println(charly.getInstrumento().getMarca());
    }

    public static void referenciaListado(ApplicationContext context) {
        Musico musico = (Musico) context.getBean("jimmy");
        List<Instrumento> instrumentos = musico.getInstrumentos();
        for (Instrumento instrumento : instrumentos) {
            System.out.println(instrumento.getMarca());
        }
    }

    public static void referenciaInterna(ApplicationContext context) {
        Musico musico = (Musico) context.getBean("james");
        System.out.println(musico.getNombres());
        System.out.println(musico.getInstrumento().getMarca());
    }

    public static void referenciaMetodos(ApplicationContext context) {
        Musico musico = (Musico) context.getBean("lennon");
        System.out.println(musico.getNombres() + " Canciones: " + musico.getNumeroCanciones());
        System.out.println(musico.getInstrumento().getMarca());
    }

    public static void valoresMetodos(ApplicationContext context) {
        Musico musico = (Musico) context.getBean("lennon");
        System.out.println(musico.getNombres() + " Canciones: " + musico.getNumeroCanciones());
    }

    public static void refenciaConstructor(ApplicationContext context) {
        Musico musico = (Musico) context.getBean("slash");
        System.out.println(musico.getInstrumento().getMarca());
    }

    public static void valoresConstructor(ApplicationContext context) {
        Musico musico = (Musico) context.getBean("bob");
        System.out.println(musico.getNumeroCanciones());

    }
}
