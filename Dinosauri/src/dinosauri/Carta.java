/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinosauri;

/**
 *
 * @author paolucci.sara
 */
public class Carta {
    private String colore;
    private int punti;
    
    public Carta(String c, int p){
        this.colore = c;
        this.punti = p;
    }
    
    public int getPunti(){
        return this.punti;
    }
    
    public String getColore(){
        return this.colore;
    }
    
}
