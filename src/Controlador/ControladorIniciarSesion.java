/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Logica.Observer.Modelo;
import Vistas.IniciarSesion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JButton;

/**
 *
 * @author thord
 */
public class ControladorIniciarSesion implements ActionListener, KeyListener {

    IniciarSesion ventana;
    Modelo modelo;

    public ControladorIniciarSesion(IniciarSesion ventana) {
        this.ventana = ventana;
        this.modelo = ventana.getModelo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() instanceof JButton) {
            JButton boton = (JButton) e.getSource();
            if (boton == ventana.getjButtonIniciarSesion()) {
                String usu = ventana.getjTextFieldUsuario().getText();
                char password[] = ventana.getjPasswordFieldPassword().getPassword();
                modelo.iniciarSesion(usu, password);
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_ENTER) {
            String usu = ventana.getjTextFieldUsuario().getText();
            char password[] = ventana.getjPasswordFieldPassword().getPassword();
            modelo.iniciarSesion(usu, password);
        }
        if (e.getKeyCode() == KeyEvent.VK_ESCAPE) {
            ventana.cerrar();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

}
