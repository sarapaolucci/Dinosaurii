/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dinosauri;

import java.io.IOException;

/**
 *
 * @author paolucci.sara
 */
public class Dinosauri {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Gestore g = new Gestore("mazzo.txt");
        Giocatore g1 = new Giocatore("Angelica");
        Giocatore g2 = new Giocatore("Elena");
        g.distribuisciCarte(g1, g2);
        g.Gioca();
    }
    
}
