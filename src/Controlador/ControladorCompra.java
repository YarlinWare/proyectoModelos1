/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Logica.Observer.Modelo;
import Vistas.VentanaCompra;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Familia-PC
 */
public class ControladorCompra implements ActionListener{

    VentanaCompra ventana;
    Modelo modelo;

    public ControladorCompra(VentanaCompra ventana) {
        this.ventana = ventana;
        this.modelo = ventana.getModelo();
    }

       
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(ventana.getjButtonProcesarPedido())) {
            modelo.procesarCompra();
        }
    }
    
}
