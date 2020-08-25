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
public class MotocicletaExploradoras extends Motocicleta {
    private double precioExploradora;
    
    public MotocicletaExploradoras(Motocicleta moto) {
        super(moto);
        this.precioExploradora = 80000;
    }

    @Override
    public double getTotal() {
        return (getMoto().getTotal()) + (getMoto().getCantidad()* precioExploradora);
    }

}
