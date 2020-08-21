/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.fabrica;

/**
 *
 * @author thord
 */
public class MotocicletaGasolina extends Motocicleta{
    int cilindraje;

    public MotocicletaGasolina(String marca, String linea, String modelo,String color,int precio, String descipcion,int cilindraje) {
        super(marca, linea, modelo, descipcion);
        this.categoria = "Gasolina";
        this.cilindraje = cilindraje;
    }
}
