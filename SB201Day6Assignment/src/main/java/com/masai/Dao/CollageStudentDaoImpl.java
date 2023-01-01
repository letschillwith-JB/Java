package com.masai.Dao;

import com.masai.exception.CollageStudentException;
import com.masai.models.Collage;
import com.masai.models.Student;
import com.masai.utility.ProvideConnection;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

public class CollageStudentDaoImpl implements CollageStudentDao{
    @Override
    public String addCollageStudent(Collage collage1, Collage collage2) {
        EntityManager em = ProvideConnection.getEntityManager();
        em.getTransaction().begin();

        em.persist(collage1);
        em.persist(collage2);

        em.getTransaction().commit();
        em.close();
        return "Collage Added Successfully....";
    }

    @Override
    public List<Student> getStudentByCollageId(int cId) throws CollageStudentException {

        EntityManager em  = ProvideConnection.getEntityManager();

        List<Student> studentList = new ArrayList<>();
        String jpql = "from Student where collage.collageId =?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1,cId);
        studentList = query.getResultList();

        return studentList;
    }

    @Override
    public Collage getCollageByStudentRoll(int roll) throws CollageStudentException {
        EntityManager em = ProvideConnection.getEntityManager();
        String jpql = "select s.collage from Student s where studentRoll = ?1";
        Query query = em.createQuery(jpql);
        query.setParameter(1,roll);
        Collage collage = (Collage) query.getSingleResult();
        if(collage != null)
            return collage;
        throw new CollageStudentException("No Student found with roll: "+roll);
    }

}
