/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Observer;

import java.util.ArrayList;

/**
 *
 * @author thord
 */
public class Sujeto {
    private ArrayList<Observer> observadores;

    public Sujeto() {
        observadores = new ArrayList<Observer>();
    }

    /**
     * @return the observadores
     */
    public ArrayList<Observer> getObservadores() {
        return observadores;
    }

    /**
     * @param observadores the observadores to set
     */
    public void setObservadores(ArrayList<Observer> observadores) {
        this.observadores = observadores;
    }
    
    public void notificar(){
        for (Observer observer : observadores) {
            observer.update();
        }
    }
    
    public void notificarUsuario(){
        for (Observer observer : observadores) {
            observer.updateUsuario();
        }
    }
}
