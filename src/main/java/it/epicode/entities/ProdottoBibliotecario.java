package it.epicode.entities;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "prodotto_bibliotecario")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@NamedQuery(name="getProductPerAnnoPubblicazione", query="select c from ProdottoBibliotecario c where year(c.annoPubblicazione) = :anno")
@NamedQuery(name="getLibroPerTitolo", query="select p from ProdottoBibliotecario p where upper(p.titolo) like upper(concat('%',:titolo, '%'))")
public abstract class  ProdottoBibliotecario {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sequenza_clienti", initialValue = 100, allocationSize = 10)
    @Column(name="codice_ibns")
    private int codiceIBNS;

    private String titolo;

    @Column(name = "anno_pubblicazione")
    private LocalDate annoPubblicazione;

    @Column(name = "numero_pagine")
    private int numeroPagine;

    @OneToOne(mappedBy = "elementoPrestato")
    private Prestito prestito;

    public ProdottoBibliotecario(){}

    public ProdottoBibliotecario(String titolo, LocalDate annoPubblicazione, int numeroPagine) {
        this.titolo = titolo;
        this.annoPubblicazione = annoPubblicazione;
        this.numeroPagine = numeroPagine;
    }

    public int getCodiceIBNS() {
        return codiceIBNS;
    }

    public void setCodiceIBNS(int codiceIBNS) {
        this.codiceIBNS = codiceIBNS;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public LocalDate getAnnoPubblicazione() {
        return annoPubblicazione;
    }

    public void setAnnoPubblicazione(LocalDate annoPubblicazione) {
        this.annoPubblicazione = annoPubblicazione;
    }

    public int getNumeroPagine() {
        return numeroPagine;
    }

    public void setNumeroPagine(int numeroPagine) {
        this.numeroPagine = numeroPagine;
    }

    @Override
    public String toString() {
        return "ProdottoBibliotecario{" +
                "codiceIBNS=" + codiceIBNS +
                ", titolo='" + titolo + '\'' +
                ", annoPubblicazione=" + annoPubblicazione +
                ", numeroPagine=" + numeroPagine +
                ", prestito=" + prestito +
                '}';
    }
}
