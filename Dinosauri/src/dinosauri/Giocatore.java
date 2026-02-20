/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinosauri;

import java.util.ArrayList;

/**
 *
 * @author paolucci.sara
 */
public class Giocatore {
    private String nome;
    private Mazzo carteInMano;
    private Mazzo mazzoPunti;
    private int puntiTot;
    
    public Giocatore(String n){
        this.nome = n;
        this.carteInMano = new Mazzo();
        this.mazzoPunti = new Mazzo();
        
    }
    
    public int CalcolaPunti(){
        puntiTot = mazzoPunti.calcolaPunti();
        return puntiTot;
    }
    
    public Carta lanciaCarta(){
        Carta c = carteInMano.primaCarta();
        return c;
    }
    
    public Mazzo getCarteInMano(){
        return this.carteInMano;
    }
    
    public Mazzo getMazzoPunti(){
        return this.mazzoPunti;
    }
    
}
