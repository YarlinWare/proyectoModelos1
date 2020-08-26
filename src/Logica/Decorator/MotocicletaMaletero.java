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
public class MotocicletaMaletero extends Motocicleta {
    private double precioMaletero;
    
    public MotocicletaMaletero(Motocicleta moto) {
        super(moto);
        this.precioMaletero = 180000;
    }

    @Override
    public double getTotal() {
        return (getMoto().getTotal()) + (getMoto().getCantidad()* precioMaletero);
    }

}
