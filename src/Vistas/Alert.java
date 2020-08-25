/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import java.awt.Component;
import java.awt.Image;
import static java.awt.image.ImageObserver.HEIGHT;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author thord
 */
public class Alert {
    public static void mensaje(Component ventana,String text,String titulo ,ImageIcon img){
        JOptionPane.showMessageDialog(ventana, text, titulo, HEIGHT, img);
    }

    
    
}
