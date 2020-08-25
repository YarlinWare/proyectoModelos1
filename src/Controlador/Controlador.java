/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Logica.Observer.Modelo;
import Vistas.IniciarSesion;
import Vistas.RegistroUsuario;
import Vistas.VentanaMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JMenuItem;
import javax.swing.JSpinner;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author thord
 */
public class Controlador implements ActionListener, ChangeListener {

    private VentanaMenu ventana;
    private Modelo modelo;

    public Controlador(VentanaMenu ventana) {
        this.ventana = ventana;
        this.modelo = ventana.getModelo();
        desactivarOpciones();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
//        System.out.println("modelo:" + modelo);
        if (e.getSource() instanceof JMenuItem) {
            JMenuItem itemMenu = (JMenuItem) e.getSource();
            if (itemMenu == ventana.getjMenuItemIniciarSesion()) {
                modelo.ventanaIniciarSesion();
            }

            if (itemMenu == ventana.getjMenuItemRegistrarNuevoUsuario()) {

                modelo.ventanaRegistro();
            }
            if (itemMenu == ventana.getjMenuItemCerrarSesion()) {
                modelo.cerrarSesion();
            }
        }
        if (e.getSource() instanceof JButton) {
            JButton boton = (JButton) e.getSource();
            String string = boton.getName();
            String[] parts = string.split("-");
            String id = parts[0];
            String part2 = parts[1];
            if (part2.equals("jButtonAgregarAlCarrito")) {
                modelo.agregarAlCarrito(id);
            }
            if (part2.equals("jButtonModificar")) {
                modelo.modificarMoto(id);
            }

        }
        if (e.getSource() instanceof JCheckBox) {
            JCheckBox checkBox = (JCheckBox) e.getSource();
            String string = checkBox.getName();
            String[] parts = string.split("-");
            String id = parts[0];
            String part2 = parts[1];
            if (part2.equals("checkBoxCasco")) {
                if (checkBox.isSelected()) {
                    modelo.agregarExploradoras(id);
//                    checkBox.setEnabled(false);
                }

            }
            if (part2.equals("checkBoxChaleco")) {
//                System.out.println("Agregar Maletero");
                if (checkBox.isSelected()) {
                    modelo.agregarMaletero(id);
//                    checkBox.setEnabled(false);
                }
            }
        }
    }

    private void desactivarOpciones() {
        ventana.getjMenuItemCerrarSesion().setEnabled(false);
        ventana.getjMenuItemModificarCatalogo().setEnabled(false);
        ventana.getjLEspacioCargo().setVisible(false);
        ventana.getjLabelEspacioNombre().setVisible(false);
        ventana.getjLabelNombre().setVisible(false);
        ventana.getJlabelCargo().setVisible(false);
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        if (e.getSource() instanceof JSpinner) {
            JSpinner snipper = (JSpinner) e.getSource();
            String string = snipper.getName();
            String[] parts = string.split("-");
            String id = parts[0];
            String part2 = parts[1];
            if (part2.equals("snipper")) {
                modelo.actualizarCantidadMoto(id, Integer.parseInt(snipper.getValue().toString()));

            }
        }

    }

}
