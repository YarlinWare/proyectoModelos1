/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica.CadenaDeResponsabilidad;

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
    
    public void solicitarAprobacion(int cantidad) {
        EncargadoAprobar asesor = new AsesorVentas();
        this.setSiguiente(asesor);
        
        EncargadoAprobar jefe = new JefeVentas();
        asesor.setSiguiente(jefe);
        
        siguiente.solicitarAprobacion(cantidad);
    }
    
}
