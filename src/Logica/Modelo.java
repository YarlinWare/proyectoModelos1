/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import java.util.ArrayList;
import Logica.fabrica.*;
import Vistas.Moto.VistaMoto;
import Vistas.Moto.VistaMotoCatalogo;
import Vistas.VentanaMenu;
import Vistas.Moto.VistaMoto;
import Vistas.Moto.VistaMotoCarrito;
import Vistas.Moto.fabricaVistaMoto;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.Iterator;
import javax.swing.ImageIcon;
import database.UsuarioDB;
import java.math.BigInteger;

/**
 *
 * @author thord
 */
public class Modelo {

    private VentanaMenu ventanaMenu;
    private Tienda tienda;

    public Modelo() {
        tienda = new Tienda();
    }
    
    public void iniciarSesion(){
        UsuarioDB usuarioDB = new UsuarioDB();
    }
    
    public String registrarUsuario(long cedula,String nombre,String correo,String cargo,String userName,char [] password, long telefono){
        System.out.println("Holaaa");
        return tienda.registrarUsuario(cedula,nombre,correo,cargo,userName,password,telefono);
    }

    public void cargarVentanaMenu() {
        ArrayList<Motocicleta> listaMotos = tienda.getCatalogo();
        getVentana().getjPanelCatalogo().setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        int gridx = 0, gridy = 0;

        for (int x = 0; x < listaMotos.size(); x++) {
            VistaMoto a = fabricaVistaMoto.construir("catalogo");
            //per...
            a.getjLabelTituloMoto().setText("<html>" + listaMotos.get(x).getLinea() + "</html>");
            a.getjPanelTitulo().setPreferredSize(new Dimension(300, listaMotos.get(x).getLinea().length() / 2));
            a.getjLabelDescripcion().setText("<html>" + listaMotos.get(x).getDescripcion() + "</html>");
            a.getjPanelDescripcion().setPreferredSize(new Dimension(10, listaMotos.get(x).getDescripcion().length() / 2));
            try {

                Image imagenInterna = new ImageIcon(getClass().
                        getResource(listaMotos.get(x).getImagen())).getImage();
                Image newimg = imagenInterna.getScaledInstance(250, 180, Image.SCALE_SMOOTH); // scale it the smooth way
                ImageIcon icon = new ImageIcon(newimg);
                a.getjLabelImagen().setIcon(icon);
                a.getjLabelImagen().setHorizontalAlignment(a.getjLabelImagen().CENTER);
                a.getjLabelImagen().setVerticalAlignment(a.getjLabelImagen().CENTER);
                a.getjLabelImagen().setText("");
            } catch (Exception e) {
            }

            gbc.gridx = gridx;
            gbc.gridy = gridy;
            gbc.gridwidth = 1;
            gbc.gridheight = 1;
            gbc.weightx = 1.0;
            gbc.weighty = 1.0;
            gbc.fill = GridBagConstraints.BOTH;
            getVentana().getjPanelCatalogo().add(a, gbc);

            if (gridx == 1) {
                gridy += 1;
                gridx = 0;
            } else {
                gridx += 1;
            }
            getVentana().getjPanelCatalogo().setPreferredSize(new Dimension(600, gridy * 450));

        }

        getVentana().getjPanelCatalogo().revalidate();
        getVentana().getjPanelCatalogo().repaint();
    }

    public VentanaMenu getVentana() {
        if (ventanaMenu == null) {
            this.ventanaMenu = new VentanaMenu(this);
        }
        return ventanaMenu;
    }

    public void iniciar() {
        getVentana().setLocationRelativeTo(null);
        getVentana().setVisible(true);
        cargarVentanaMenu();

    }

}
