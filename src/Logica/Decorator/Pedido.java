/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Decorator;

import Logica.Moto;
import java.util.ArrayList;

public class Pedido implements ObjetosPedido {

    /*Arraylist para probar arreglo de motos*/
    ArrayList<MotoDecorator> Motos = new ArrayList();

    /*Este método se usa para ensayar con un arreglo de motos*/
    public ArrayList<MotoDecorator> llenarArreglo() {

        MotoDecorator motoD = new MotoDecorator();
        motoD.setColor("azul");
        motoD.setPrecio(4000000);
        Motos.add(motoD);
        MotoDecorator motoD2 = new MotoDecorator();
        motoD2.setColor("rojo");
        motoD2.setPrecio(8000000);
        Motos.add(motoD2);

        return Motos;
    }

    /*..............................................*/

    @Override
    public String getDescripcion() {
        llenarArreglo();
        return Motos.size() + " Motos ";
    }

    @Override
    public int getPrecio() {
        int precioTotal = 0;
        for (int i = 0; i < Motos.size(); i++) {
            precioTotal += Motos.get(i).getPrecio();
        }
        return precioTotal;
    }
}
