package it.epicode.dao;

import it.epicode.entities.Libro;
import it.epicode.entities.ProdottoBibliotecario;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

public class ProdottoBibliotecarioDao {
    private EntityManagerFactory emf;
    private EntityManager em;

    public ProdottoBibliotecarioDao(){
        emf = Persistence.createEntityManagerFactory("catalogo_bibliotecario");
        em = emf.createEntityManager();
    }

    public void saveProdottoBibliotecario(ProdottoBibliotecario c){
        EntityTransaction et = em.getTransaction();
        et.begin();

        em.persist(c);
        et.commit();
    }

    public ProdottoBibliotecario getById(int id){
        return em.find(Libro.class, id);
    }

    public void deleteLibro(int id){
        EntityTransaction et = em.getTransaction();
        et.begin();
        ProdottoBibliotecario c = getById(id);
        em.remove(c);
        et.commit();
    }

    public List<ProdottoBibliotecario> getProductPerAnnoPubblicazione(LocalDate  anno){
        Query q = em.createNamedQuery("getProductPerAnnoPubblicazione");
        q.setParameter("annoPubblicazione", anno);
        return q.getResultList();
    }
}
