package org.codeforall.services;

import org.codeforall.daos.Dao;
import org.codeforall.model.Family;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;

@Service
public class FamilyService {

    private Dao dao;

    public Family getFamilyId(int id){
        Family family = dao.findById(id);
        return family;
    }

    @Transactional
    public List<Family> listFamily(){ return dao.read();}
    @Transactional
    public Family addFamily(Family family){
        System.out.println("Service addFamily is called with " + family.getFamilyName());
        dao.create(family);
        return family;
    }

    @Autowired
    public void setDao(Dao dao) {
        this.dao = dao;
    }
}
