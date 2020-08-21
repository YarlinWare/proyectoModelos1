/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Logica.Modelo;
import Vistas.VentanaMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author thord
 */
public class Controlador implements ActionListener{
    private VentanaMenu ventana;
    private Modelo modelo;
    public Controlador(VentanaMenu ventana){
        this.ventana = ventana;
        this.modelo = ventana.getModelo();
        desactivarOpciones();
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }

    private void desactivarOpciones() {
        ventana.getjMenuItemCerrarSesion().setEnabled(false);
        ventana.getjMenuItemModificarCatalogo().setEnabled(false);
    }
    
}
