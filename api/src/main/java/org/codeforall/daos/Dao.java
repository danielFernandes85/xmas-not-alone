package org.codeforall.daos;

import org.codeforall.model.Family;
import org.codeforall.services.FamilyService;
import org.springframework.stereotype.Component;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Component
public class Dao {

    private EntityManager em;

    public Family findById(Integer id) {return em.find(Family.class, id);}

    public List<Family> read(){
        TypedQuery<Family> query = em.createQuery("SELECT family FROM Family family", Family.class);
        return query.getResultList();
    }

    public Family create(Family family) {
        System.out.println("Dao create is called with " + family.getFamilyName());
        return em.merge(family);
    }


    @PersistenceContext
    public void setEm(EntityManager em) {
        this.em = em;
    }
}
