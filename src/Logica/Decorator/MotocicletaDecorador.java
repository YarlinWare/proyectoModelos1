/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Decorator;
import Logica.fabrica.Motocicleta;

/**
 *
 * @author Familia-PC
 */
public abstract class MotocicletaDecorador implements Item{

    private Motocicleta moto;

    public MotocicletaDecorador(Motocicleta moto){
        this.moto = moto;
    }
    
    protected Motocicleta getMoto(){
        return moto;
    }

}
