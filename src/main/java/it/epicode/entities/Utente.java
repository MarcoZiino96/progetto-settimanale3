package it.epicode.entities;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "utente")
public class Utente {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "sequenza_clienti", initialValue = 0, allocationSize = 3)
    private int numero_tessera;

    private  String nome;
    private String cognome;

    @Column(name = "data_nascita")
    private LocalDate dataNascita;

    @OneToMany(mappedBy = "utente",cascade = CascadeType.REMOVE, fetch = FetchType.EAGER)
    private List<Prestito> prestito;

    public List<Prestito> getPrestito() {
        return prestito;
    }

    public void setPrestito(List<Prestito> prestito) {
        this.prestito = prestito;
    }

    public Utente(){}

    @Override
    public String toString() {
        return
                "numero_tessera=" + numero_tessera +
                ", nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", dataNascita=" + dataNascita;
    }

    public Utente( String nome, String cognome, LocalDate dataNascita, List<Prestito> prestito) {
        this.nome = nome;
        this.cognome = cognome;
        this.dataNascita = dataNascita;
        this.prestito = prestito;
    }

    public int getNumero_tessera() {
        return numero_tessera;
    }

    public void setNumero_tessera(int numero_tessera) {
        this.numero_tessera = numero_tessera;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public LocalDate getDataNascita() {
        return dataNascita;
    }

    public void setDataNascita(LocalDate dataNascita) {
        this.dataNascita = dataNascita;
    }
}
