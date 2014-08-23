package com.tecsup.springagosto.jdbc;

import com.tecsup.springagosto.jdbc.dao.ProgramaDAO;
import com.tecsup.springagosto.jdbc.model.Programa;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppJdbc {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("jdbc_db.xml");
        AppJdbc.doList(context);
    }

    public static void doList(ApplicationContext context) {
        ProgramaDAO programaDAO = (ProgramaDAO) context.getBean("programaDAO");
        List<Programa> programas = programaDAO.all();

        for (Programa programa : programas) {
            System.out.println(programa.getNombre());
        }
    }
}
