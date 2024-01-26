package it.epicode;

import it.epicode.dao.*;
import it.epicode.entities.*;

import java.time.LocalDate;
import java.util.List;


public class MainArchivioBibliotecario {

    public static void main(String[] args) {

        UtenteDao utenteDao = new UtenteDao();
        PrestitoDao prestitoDao = new PrestitoDao();
        LibroDao libroDao = new LibroDao();
        RivistaDao rivistaDao = new RivistaDao();
        ProdottoBibliotecarioDao prodottoBibliotecariodao= new ProdottoBibliotecarioDao();


    // creo alcuni prodotti e li salvo nel database

 //    Libro l1 = new Libro("alla ricerca di nemo",LocalDate.of(2000,1,1), 250, "disney", "cartoon");
 //    Libro l2 = new Libro("cosa nostra",LocalDate.of(2005,1,1), 550, "fabio volo", "gangstar");
 //    Rivista r1 = new Rivista("mangiare bene", LocalDate.of(2024,1,1),150, Periodicita.MENSILE);
 //    Rivista r2 = new Rivista("java is strong", LocalDate.of(2021,1,1),150, Periodicita.MENSILE);

 //    libroDao.saveLibro(l1);
 //    libroDao.saveLibro(l2);
 //    rivistaDao.saveRivista(r1);
 //    rivistaDao.saveRivista(r2);

    //creo alcuni utenti e li salvo nel database

  //  Utente u1 = new Utente();
  //  u1.setNome("marco");
  //  u1.setCognome("fatigati");
  //  u1.setDataNascita(LocalDate.of(1995,1,1));



  //  Utente u2 = new Utente();
  //  u2.setNome("marco");
  //  u2.setCognome("fatigati");
  //  u2.setDataNascita(LocalDate.of(1993,1,1));


        //creo alcuni prestiti e aggiungo una persona ad ogni singolo prestito creato e li salvo nel database

 //      Utente u1 = utenteDao.getById(1);
 //      Utente u2 = utenteDao.getById(2);

//        Libro l1 = libroDao.getById(1);
//        Libro l2 = libroDao.getById(2);

//        Rivista r1 = rivistaDao.getById(52);
//        Rivista r2 = rivistaDao.getById(53);



     // Prestito p1 = new Prestito(u1,l1,LocalDate.of(2024,2,25), LocalDate.of(2024,4,25));
     // Prestito p2 = new Prestito(u1,r1,LocalDate.of(2024,2,25), LocalDate.of(2024,4,25));
     // Prestito p3 = new Prestito(u2,l2,LocalDate.of(2024,1,25), LocalDate.of(2024,2,28));
     // Prestito p4 = new Prestito(u2,r2,LocalDate.of(2024,1,1), LocalDate.of(2024,1,26));

        //prestitoDao.savePrestito(p1);
        //prestitoDao.savePrestito(p2);
        //prestitoDao.savePrestito(p3);
        //prestitoDao.savePrestito(p4);

        // ho creato una query in prodotto publicitario e creato il metodo getProcdutAnnoPubblicazione nella rispettiva classe Dao
        // con il fine di cercare i prodotti per anno di publicazione
       //prodottoBibliotecariodao.getProductPerAnnoPubblicazione("2024").stream().forEach(System.out::println);

        // ho creato una query in prodotto publicitario e creato il metodo getProcdutAnnoTitolo nella rispettiva classe Dao
        // con il fine di cercare i prodotti per titolo

    //prodottoBibliotecariodao.getProductPerTitolo("mangiare").stream().forEach(System.out::println);

        // ho creato una query in lIBRO e creato il metodo getlibroPerAnno nella rispettiva classe Dao
        // con il fine di cercare i prodotti per autore

      //  libroDao.getLibroPerAutore("disney").stream().forEach(c-> System.out.println(c));
}



}
