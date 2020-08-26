/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Logica.fabrica.Motocicleta;
import java.util.ArrayList;

/**
 *
 * @author Familia-PC
 */
public class Venta {

    ArrayList<Motocicleta> motosVenta;
    double precioTotal;
    int cantidadTotal;
    String infoAprobacion;
    boolean aprobada;

    public Venta(ArrayList<Motocicleta> motosVenta) {
        this.motosVenta = motosVenta;
        this.precioTotal = 0;
        this.cantidadTotal = 0;
        this.aprobada = false;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public int getCantidadTotal() {
        return cantidadTotal;
    }

    public void setCantidadTotal(int cantidadTotal) {
        this.cantidadTotal = cantidadTotal;
    }

    public String getInfoAprobacion() {
        return infoAprobacion;
    }

    public void setInfoAprobacion(String infoAprobacion) {
        this.infoAprobacion = infoAprobacion;
    }

    
    
    public boolean isAprobada() {
        return aprobada;
    }

    public void setAprobada(boolean aprobada) {
        this.aprobada = aprobada;
    }

    
}
