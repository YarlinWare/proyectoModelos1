/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Decorator;

/**
 *
 * @author Familia-PC
 */
public class Impermeable extends AccesoriosDecorator {

    public Impermeable(ObjetosPedido obj) {
        super(obj);
    }

    public String getDescripcion() {
        return getObj().getDescripcion() + "+ Impermeables";
    }

    public int getPrecio() {
        return getObj().getPrecio() + 50000;
    }

}
