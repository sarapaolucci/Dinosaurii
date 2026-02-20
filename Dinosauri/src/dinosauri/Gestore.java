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
    private Mazzo carteInTavola;
    private Giocatore g1;
    private Giocatore g2;
    
    public Gestore(String s) throws IOException{
        this.f = new FileManager(s);
        this.mazzoIniziale = f.leggiFile();
        this.carteInTavola = new Mazzo();
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
        int mano = 0;
        for(int i = 0; i < mazzoIniziale.getCarte().size()/2; i++){
            mano = i + 1;
            String risultato = " ";
            Carta c1 = g1.lanciaCarta();
            Carta c2 = g2.lanciaCarta();
            if(c1.getPunti()== c2.getPunti()){
                risultato = "Pareggio";
                carteInTavola.getCarte().add(c1);
                carteInTavola.getCarte().add(c2);
            }
            else if(c1.getPunti() > c2.getPunti()){
                risultato = "Vince la mano il giocatore 1";
                g1.getMazzoPunti().getCarte().add(c1);
                g1.getMazzoPunti().getCarte().add(c2);
                puntiInTavola(g1);
            }
            else{
                risultato = "Vince la mano il giocatore 2";
                g2.getMazzoPunti().getCarte().add(c1);
                g2.getMazzoPunti().getCarte().add(c2);
                puntiInTavola(g2);
            }
            g1.getCarteInMano().getCarte().remove(c1);
            g2.getCarteInMano().getCarte().remove(c2);
            System.out.println("Mano n. " + mano + "\nCarta giocatore 1: " + c1.getColore() + "\nCarta giocatore 2: "+ c2.getColore() + "\nRisultato: "+ risultato + "\nPunteggio giocatore 1: "+ g1.CalcolaPunti() + "\nPunteggio giocatore 2: "+ g2.CalcolaPunti() + "\n");
        }
    }
    
    public void puntiInTavola(Giocatore g){
        Mazzo m = g.getMazzoPunti();
        for(int i = 0; i < carteInTavola.getCarte().size(); i++){
            m.getCarte().add(carteInTavola.getCarte().get(i));
        }
        carteInTavola.getCarte().clear();
    }
    
}
