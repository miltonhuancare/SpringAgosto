package com.tecsup.springagosto.jdbc;

import com.tecsup.springagosto.jdbc.dao.ProgramaDAO;
import com.tecsup.springagosto.jdbc.model.Programa;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppJdbc {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc_db.xml");
        AppJdbc.doDelete(context);
    }

        public static void doDelete(ApplicationContext cntx) {
        ProgramaDAO programaDAO = (ProgramaDAO) cntx.getBean("programaDAO");

        Programa programa = programaDAO.find("127");
        programaDAO.delete(programa.getId());

    }
    public static void doUpdate(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");

        Programa programa = programaDAO.find("127");
        programa.setCodigo("333");
        programa.setNombre("APP RUN");

        programaDAO.update(programa);

    }

    public static void doSave(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        //Programa programa = programaDAO.find(1l);
        Programa programa = new Programa();
        programa.setCodigo("127");
        programa.setDescripcion("Desarrollo de Software");
        programa.setNombre("446544");



    }

    public static void doFind(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        //Programa programa = programaDAO.find(1l);
        Programa programa = programaDAO.find("124");

        System.out.println(programa.getNombre());

    }

    public static void doList(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        List<Programa> programas = programaDAO.all();

        for (Programa programa : programas) {
            System.out.println(programa.getNombre());
        }
    }
}
