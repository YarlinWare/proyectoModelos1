/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Logica.Modelo;
import Vistas.IniciarSesion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author thord
 */
public class ControladorIniciarSesion implements ActionListener{
    IniciarSesion ventana;
    Modelo modelo;
    
    public ControladorIniciarSesion(IniciarSesion ventana){
        this.ventana = ventana;
        this.modelo =  ventana.getModelo();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource() instanceof JButton){
             JButton boton =(JButton) e.getSource();
             if(boton == ventana.getjButtonIniciarSesion()){
                 String usu = ventana.getjTextFieldUsuario().getText();
                 char password[] = ventana.getjPasswordFieldPassword().getPassword();
                 System.out.println("usuario: " + usu);
                 System.out.print("Contra: ");
                 for(int x = 0 ; x< password.length;x++){
                     System.out.print(password[x]);
                 }
             }
         }
    }
    
}
