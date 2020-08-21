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
public class Casco extends AccesoriosDecorator {

    public Casco(ObjetosPedido obj) {
        super(obj);
    }

    public String getDescripcion() {
        return getObj().getDescripcion() + "+ Cascos";
    }

    public int getPrecio() {
        return getObj().getPrecio() + 100000;
    }

}
