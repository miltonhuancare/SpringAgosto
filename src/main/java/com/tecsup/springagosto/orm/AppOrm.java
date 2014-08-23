package com.tecsup.springagosto.orm;

import com.tecsup.springagosto.orm.dao.ProgramaDAO;
import com.tecsup.springagosto.orm.model.Programa;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppOrm {

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("hibernate_db.xml");
       
        AppOrm.doInsert(context);
        AppOrm.doList(context);
  
    }
    public static void doInsert(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");

        Programa programa = new Programa();
        programa.setCodigo("999");
        programa.setNombre("GENERAL");

        programaDAO.save(programa);
    }

    public static void doList(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        List<Programa> programas = programaDAO.all();

        for (Programa programa : programas) {
            System.out.println(programa.getNombre());

        }
    }

    private static void doUpdate(ApplicationContext context) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}