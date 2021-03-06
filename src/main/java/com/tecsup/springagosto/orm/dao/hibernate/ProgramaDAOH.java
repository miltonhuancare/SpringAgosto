package com.tecsup.springagosto.orm.dao.hibernate;

import com.tecsup.springagosto.orm.dao.ProgramaDAO;
import com.tecsup.springagosto.orm.model.Programa;
import com.tecsup.springagosto.orm.dao.BaseHibernateDAO;
import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Repository;

@Repository("programaDAO")
public class ProgramaDAOH extends BaseHibernateDAO implements ProgramaDAO {

    public List<Programa> all() {
        Criteria criteria = this.getSession().createCriteria(Programa.class);
        return criteria.list();
    }

    public Programa find(Long id) {
        Criteria criteria = this.getSession().createCriteria(Programa.class);
        criteria.add(Restrictions.eq("id", id));
        return (Programa) criteria.uniqueResult();
    }

    public void save(Programa t) {
        this.getSession().save(t);
    }

    public void update(Programa t) {
        this.getSession().update(t);
    }

    public void delete(Programa id) {
        this.getSession().delete(id);

    }

  
}
