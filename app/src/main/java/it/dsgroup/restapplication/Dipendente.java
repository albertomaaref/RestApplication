package it.dsgroup.restapplication;

import java.io.Serializable;

/**
 * Created by utente9.academy on 28/11/2017.
 */

public class Dipendente implements Serializable {

    private  String id;
    private  String nome;
    private String cognome ;

    public Dipendente() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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
}
