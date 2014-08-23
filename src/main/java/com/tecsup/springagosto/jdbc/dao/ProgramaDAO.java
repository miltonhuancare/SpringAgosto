package com.tecsup.springagosto.jdbc.dao;

import com.tecsup.springagosto.jdbc.helper.GenericDAO;
import com.tecsup.springagosto.jdbc.model.Programa;

public interface ProgramaDAO extends GenericDAO<Programa>{

    Programa find(String codigo);
}
