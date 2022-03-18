package com.mytodoapp.DAO;

import com.mytodoapp.Entity.ToDo;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import java.util.List;

@Repository
public class ToDoDAOHibernateImpl implements ToDoDAO
{
    public EntityManager entityManager;
    public ToDoDAOHibernateImpl(EntityManager theEntityManager){
        entityManager=theEntityManager;
    }
    public List<ToDo>findAll(){
        Session currentSession=entityManager.unwrap(Session.class);
        Query<ToDo> theQuery=currentSession.createQuery("from ToDo ",ToDo.class);
        List<ToDo> toDos=theQuery.getResultList();
        return toDos;
    }

}

