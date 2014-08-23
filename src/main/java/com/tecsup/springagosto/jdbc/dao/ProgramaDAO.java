package com.tecsup.springagosto.jdbc.dao;

import com.tecsup.springagosto.jdbc.model.Programa;
import java.util.List;

public interface ProgramaDAO {

    List<Programa> all();

    Programa find(Long id);

    void save(Programa programa);

    void update(Programa programa);

    void delete(Programa programa);

    Programa find(String nombre);
}
