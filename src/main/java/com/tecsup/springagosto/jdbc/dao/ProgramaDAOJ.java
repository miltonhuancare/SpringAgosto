
package com.tecsup.springagosto.jdbc.dao;

import com.tecsup.springagosto.jdbc.model.Programa;
import java.util.List;
import org.springframework.jdbc.core.support.JdbcDaoSupport;


public class ProgramaDAOJ extends JdbcDaoSupport implements ProgramaDAO{

    public List<Programa> all() {
        String query ="select * from programa";
        return this.getJdbcTemplate().query(query, new ProgramaRowMapper());
    }

    public Programa find(Long id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void save(Programa programa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void update(Programa programa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void delete(Programa programa) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Programa find(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
