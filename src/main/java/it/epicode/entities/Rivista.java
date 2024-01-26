package it.epicode.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

import java.time.LocalDate;


@Entity
@Table(name = "riviste")
public class Rivista extends ProdottoBibliotecario{

    @Override
    public String toString() {

        return
                "codiceIbsn='" + getCodiceIBNS() + '\'' +
                "annoPublicazione='" + getAnnoPubblicazione() + '\'' +
                "titolo='" + getTitolo() + '\'' +
                "numeroPagine='" + getNumeroPagine()+ '\''+
                "periodicita=" + periodicita;
    }

    public Periodicita getPeriodicita() {
        return periodicita;
    }

    public void setPeriodicita(Periodicita periodicita) {
        this.periodicita = periodicita;
    }

    @Enumerated(EnumType.STRING)
    private Periodicita periodicita;
    public  Rivista(){}

    public Rivista(String titolo, LocalDate annoPubblicazione, int numeroPagine, Periodicita periodicita) {
        super(titolo, annoPubblicazione, numeroPagine);
        this.periodicita = periodicita;
    }
}
