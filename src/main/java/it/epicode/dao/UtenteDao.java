package it.epicode.dao;

import it.epicode.entities.Libro;
import it.epicode.entities.Utente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class UtenteDao {
    private EntityManagerFactory emf;
    private EntityManager em;

    public UtenteDao(){
        emf = Persistence.createEntityManagerFactory("catalogo_bibliotecario");
        em = emf.createEntityManager();
    }

    public void saveUtente(Utente c){
        EntityTransaction et = em.getTransaction();
        et.begin();

        em.persist(c);
        et.commit();
    }

    public Utente getById(int id){
        return em.find(Utente.class, id);
    }

    public void deleteUtente(int id){
        EntityTransaction et = em.getTransaction();
        et.begin();
        Utente c = getById(id);
        em.remove(c);
        et.commit();
    }
}
