/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinosauri;

import java.io.IOException;

/**
 *
 * @author paolucci.sara
 */
public class Gestore {
    private FileManager f;
    private Mazzo mazzoIniziale;
    private Giocatore g1;
    private Giocatore g2;
    
    public Gestore(String s) throws IOException{
        this.f = new FileManager(s);
        this.mazzoIniziale = f.leggiFile();
    }
    
    public void distribuisciCarte(Giocatore g1, Giocatore g2){
        this.g1 = g1;
        this.g2 = g2;
        for(int i = 0; i < mazzoIniziale.getCarte().size(); i++){
            Carta c = mazzoIniziale.getCarte().get(i);
            if(i % 2 != 0){
                g2.getCarteInMano().getCarte().add(c);
            }
            else{
                g1.getCarteInMano().getCarte().add(c);
            }
        }
    }
    
    public void Gioca(){
        for(int i = 0; i < mazzoIniziale.getCarte().size()/2; i++){
            
        }
    }
    
}
