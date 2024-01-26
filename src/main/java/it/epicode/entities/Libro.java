package it.epicode.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;

import java.time.LocalDate;

@Entity
@Table(name = "libro")
@NamedQuery(name = "getLibroPerAutore", query="select l from Libro l where l.autore =:autore")
public class Libro extends ProdottoBibliotecario{

    private  String autore;
    private String genere;

   public Libro(){}

    public Libro(String titolo, LocalDate annoPubblicazione, int numeroPagine, String autore, String genere) {
        super(titolo, annoPubblicazione, numeroPagine);
        this.autore = autore;
        this.genere = genere;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    @Override
    public String toString() {

        return "codiceIbsn='" + getCodiceIBNS() + '\'' +
                "annoPublicazione='" + getTitolo() + '\'' +
                "titolo='" + getTitolo() + '\'' +
                "numeroPagine='" + getNumeroPagine()+ '\'' +
                "autore='" + autore + '\'' +
                ", genere='" + genere + '\'';
    }
}
