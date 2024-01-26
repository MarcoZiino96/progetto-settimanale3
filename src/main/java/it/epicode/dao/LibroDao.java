package it.epicode.dao;

import it.epicode.entities.Libro;
import jakarta.persistence.*;

import java.util.List;

public class LibroDao {
    private EntityManagerFactory emf;
    private EntityManager em;

    public LibroDao(){
        emf = Persistence.createEntityManagerFactory("catalogo_bibliotecario");
        em = emf.createEntityManager();
    }

    public void saveLibro(Libro c){
        EntityTransaction et = em.getTransaction();
        et.begin();

        em.persist(c);
        et.commit();
    }

    public Libro getById(int id){
        return em.find(Libro.class, id);
    }

    public void deleteLibro(int id){
        EntityTransaction et = em.getTransaction();
        et.begin();
        Libro c = getById(id);
        em.remove(c);
        et.commit();
    }

    public List<Libro> getLibroPerAutore(String autore){
        Query q = em.createNamedQuery("getLibroPerAutore");
        q.setParameter("autore", autore);
        return q.getResultList();
    }
}
