/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.CadenaDeResponsabilidad;

import Logica.Usuario;
import Logica.Venta;

/**
 *
 * @author Familia-PC
 */
public class Aprobacion extends EncargadoAprobar {

    private EncargadoAprobar siguiente;
    
    public EncargadoAprobar getSiguiente() {
        return siguiente;
    }
    
    public void setSiguiente(EncargadoAprobar siguiente) {
        this.siguiente = siguiente;
    }
    
    public void solicitarAprobacion(Venta venta, Usuario usuario) {
        EncargadoAprobar asesor1 = new Asesor1();
        this.setSiguiente(asesor1);
        
        EncargadoAprobar asesor2 = new Asesor2();
        asesor1.setSiguiente(asesor2);
        
        EncargadoAprobar jefe = new JefeVentas();
        asesor2.setSiguiente(jefe);
        
        siguiente.solicitarAprobacion(venta,usuario);
    }
    
}
