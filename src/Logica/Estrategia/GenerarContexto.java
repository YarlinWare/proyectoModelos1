/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.Estrategia;

import Logica.fabrica.Motocicleta;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class GenerarContexto {
    
    private InterfaceStrategy estrategia;
    
    public GenerarContexto(InterfaceStrategy estrategia){
        this.estrategia = estrategia;
    }
    
    public void ejecutar(ArrayList<Motocicleta> catalogo){
        System.out.println("Ejecutando pdf");
        this.estrategia.generarDocumento(catalogo);
    }
}
