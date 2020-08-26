/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Logica.Observer.Modelo;
import Vistas.VentanaPedido;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Familia-PC
 */
public class ControladorCompra implements ActionListener, WindowListener {

    VentanaPedido ventana;
    Modelo modelo;

    public ControladorCompra(VentanaPedido ventana) {
        this.ventana = ventana;
        this.modelo = ventana.getModelo();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(ventana.getjButtonProcesarPedido())) {
            modelo.procesarCompra();
        }
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {
        modelo.cargarDatosCompra();
    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

}
