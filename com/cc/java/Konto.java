package com.cc.java;

public class Konto {
    // Private Instanzvariable Kontostand
    private int kontostand; 
        
    // Konstruktor
    public Konto() {

    // Anfangswert 10000 setzen
    this.kontostand = 10000;
    }

    // Getter Methode für Kontostand
    public int getKontostand() {
        return this.kontostand;
    }

    // Methode zur Verdreifachung des Kontostands
    public void verdoppeln() {
        this.kontostand *= 2;
    }

    // Methode zur Verdreifachung des Kontostands
    public void verdreifachen() {
        this.kontostand *= 3;
    }

    // Methode zur Verzehnfachung des Kontostands
    public void verzehnfachen() {
        this.kontostand *= 10;
    }    
}
