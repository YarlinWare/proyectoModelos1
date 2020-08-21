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
public class MotocicletaElectrica extends Motocicleta{
    
    
    int potencia;

    public MotocicletaElectrica(String marca, String linea, String modelo,String color,int precio, String descipcion,int potencia) {
        super(marca, linea, modelo, descipcion);
        this.categoria = "Electrica";
        this.potencia = potencia;
        
    }
    
    
}
