/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dinosauri;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author paolucci.sara
 */
public class FileManager {
    private String csvFile;
    
    public FileManager(String s){
        this.csvFile = s;
    }
    
    public Mazzo leggiFile() throws FileNotFoundException, IOException{
        Mazzo m = new Mazzo();
        int punti = 0;
        try(BufferedReader reader = new BufferedReader(new FileReader (csvFile))){
            String line;
            while((line = reader.readLine()) != null){
                if(line.equals("Verde")){
                    punti = 3;
                }
                else if (line.equals("Rosso")){
                    punti = 5;
                }
                else{
                    punti = 1;
                }
                Carta c = new Carta(line,punti);
                m.getCarte().add(c);
            }
            return m;
        }
    }
    
}
