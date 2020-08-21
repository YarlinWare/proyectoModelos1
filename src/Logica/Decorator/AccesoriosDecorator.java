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
public abstract class AccesoriosDecorator implements ObjetosPedido {

    private ObjetosPedido obj;

    public ObjetosPedido getObj() {
        return obj;
    }

    public void setObj(ObjetosPedido obj) {
        this.obj = obj;
    }

    public AccesoriosDecorator(ObjetosPedido obj) {
        setObj(obj);
    }

}
