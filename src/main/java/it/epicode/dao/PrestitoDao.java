package it.epicode.dao;

import it.epicode.entities.Libro;
import it.epicode.entities.Prestito;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class PrestitoDao {

    private EntityManagerFactory emf;
    private EntityManager em;

    public PrestitoDao(){
        emf = Persistence.createEntityManagerFactory("catalogo_bibliotecario");
        em = emf.createEntityManager();
    }

    public void savePrestito(Prestito c){
        EntityTransaction et = em.getTransaction();
        et.begin();
        em.persist(c);
        et.commit();
    }

    public Prestito getById(int id){
        return em.find(Prestito.class, id);
    }

    public void deletePrestito(int id){
        EntityTransaction et = em.getTransaction();
        et.begin();
        Prestito c = getById(id);
        em.remove(c);
        et.commit();
    }
}
