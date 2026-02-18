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
public class Mazzo {
    private ArrayList<Carta> carte;
    
    public Mazzo(){
        this.carte = new ArrayList();
    }
    
    public Carta primaCarta(){
        return carte.get(0);
    }
    
    public ArrayList<Carta> getCarte(){
        return this.carte;
    }
    
    public int calcolaPunti(){
        int punti = 0;
        for(int i = 0; i < carte.size(); i++){
            punti += carte.get(i).getPunti();
        }
        return punti;
    }
    
}
