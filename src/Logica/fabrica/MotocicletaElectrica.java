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

    public MotocicletaElectrica(int id,String marca, String linea, String modelo,String color,int precio, String descipcion,int potencia,String imagen) {
        super(id,marca, linea, modelo, descipcion,imagen);
        this.categoria = "Electrica";
        this.potencia = potencia;
        
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    
    
    
}
