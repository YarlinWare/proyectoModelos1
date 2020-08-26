/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Memento;

import Logica.fabrica.Motocicleta;
import java.util.ArrayList;

/**
 *
 * @author thord
 */
public class Memento {
    private ArrayList<ArrayList<Motocicleta>> backup;
    
    public Memento(){
        backup = new ArrayList<>();
    }
    
    public void setBackup(ArrayList<Motocicleta> motos){
        ArrayList<Motocicleta> lista = new ArrayList<>();
        motos.forEach((moto) -> {
            lista.add(moto);
        });
        backup.add(lista);
    }
    
    public boolean eliminarBackip(ArrayList<Motocicleta> motos){
        return backup.remove(motos);
    }
    
    public ArrayList<Motocicleta> getBackup(int i){
        return backup.get(i);
    }
    
    public int getSize(){
        return backup.size();
    }
}
