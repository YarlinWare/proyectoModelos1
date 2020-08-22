/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Logica.Modelo;
import Vistas.IniciarSesion;
import Vistas.RegistroUsuario;
import Vistas.VentanaMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JMenuItem;

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
        System.out.println("modelo:" + modelo);
        if(e.getSource() instanceof JMenuItem){
            JMenuItem itemMenu = (JMenuItem)e.getSource();
            if(itemMenu == ventana.getjMenuItemIniciarSesion()){
                new IniciarSesion(ventana, true,modelo).setVisible(true);
            }
            
            if(itemMenu == ventana.getjMenuItemRegistrarNuevoUsuario()){
                
                new RegistroUsuario(ventana, true,modelo).setVisible(true);
            }
            
        }
    }

    private void desactivarOpciones() {
        ventana.getjMenuItemCerrarSesion().setEnabled(false);
        ventana.getjMenuItemModificarCatalogo().setEnabled(false);
    }
    
}
