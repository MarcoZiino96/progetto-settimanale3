package it.epicode.dao;

import it.epicode.entities.Libro;
import it.epicode.entities.Rivista;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class RivistaDao {

    private EntityManagerFactory emf;
    private EntityManager em;

    public RivistaDao(){
        emf = Persistence.createEntityManagerFactory("catalogo_bibliotecario");
        em = emf.createEntityManager();
    }

    public void saveRivista(Rivista c){
        EntityTransaction et = em.getTransaction();
        et.begin();

        em.persist(c);
        et.commit();
    }

    public Rivista getById(int id){
        return em.find(Rivista.class, id);
    }

    public void deleteRivista(int id){
        EntityTransaction et = em.getTransaction();
        et.begin();

        Rivista c = getById(id);
        em.remove(c);
        et.commit();
    }
}
