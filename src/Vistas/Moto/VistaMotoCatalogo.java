/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Moto;

import Logica.Observer.Modelo;
import java.awt.Dimension;

/**
 *
 * @author thord
 */
public class VistaMotoCatalogo extends VistaMoto {

    /**
     * Creates new form NewJPanel
     */
    public VistaMotoCatalogo(Modelo modelo) {
        super(modelo);
        this.setSize(new Dimension(300, 200));
        inicializar();
    }

    public void inicializar() {

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelTitulo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelTitulo.setPreferredSize(new java.awt.Dimension(200, 10));

        jLabelTituloMoto.setText("TITULO");

        javax.swing.GroupLayout jPanelTituloLayout = new javax.swing.GroupLayout(jPanelTitulo);
        jPanelTitulo.setLayout(jPanelTituloLayout);
        jPanelTituloLayout.setHorizontalGroup(
                jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelTituloLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelTituloMoto, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanelTituloLayout.setVerticalGroup(
                jPanelTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelTituloLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelTituloMoto)
                                .addContainerGap(23, Short.MAX_VALUE))
        );

        jScrollPaneTitulo.setViewportView(jPanelTitulo);

        jPanelImagen.setBackground(new java.awt.Color(255, 255, 255));

        jLabelImagen.setBackground(new java.awt.Color(255, 255, 255));
        jLabelImagen.setText("jLabel1");

        javax.swing.GroupLayout jPanelImagenLayout = new javax.swing.GroupLayout(jPanelImagen);
        jPanelImagen.setLayout(jPanelImagenLayout);
        jPanelImagenLayout.setHorizontalGroup(
                jPanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanelImagenLayout.setVerticalGroup(
                jPanelImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, 269, Short.MAX_VALUE)
        );

        jPanelDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        jPanelDescripcion.setPreferredSize(new java.awt.Dimension(200, 50));

        jLabelDescripcion.setText("Descripcion...");

        javax.swing.GroupLayout jPanelDescripcionLayout = new javax.swing.GroupLayout(jPanelDescripcion);
        jPanelDescripcion.setLayout(jPanelDescripcionLayout);
        jPanelDescripcionLayout.setHorizontalGroup(
                jPanelDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelDescripcionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelDescripcion, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanelDescripcionLayout.setVerticalGroup(
                jPanelDescripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelDescripcionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelDescripcion)
                                .addContainerGap(43, Short.MAX_VALUE))
        );

        jScrollPaneDescripcion.setViewportView(jPanelDescripcion);

        jPanelBotones.setBackground(new java.awt.Color(255, 255, 255));

        jButtonModificar.setBackground(new java.awt.Color(255, 102, 0));
        jButtonModificar.setText("Modificar");
        jButtonModificar.setMaximumSize(new java.awt.Dimension(117, 23));
        jButtonModificar.setMinimumSize(new java.awt.Dimension(117, 23));

        jButtonAgregarAlCarrito.setBackground(new java.awt.Color(102, 255, 0));
        jButtonAgregarAlCarrito.setText("Agregar al carrito");

        javax.swing.GroupLayout jPanelBotonesLayout = new javax.swing.GroupLayout(jPanelBotones);
        jPanelBotones.setLayout(jPanelBotonesLayout);
        jPanelBotonesLayout.setHorizontalGroup(
                jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelBotonesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButtonAgregarAlCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, 205, Short.MAX_VALUE)
                                .addContainerGap())
        );
        jPanelBotonesLayout.setVerticalGroup(
                jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanelBotonesLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanelBotonesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonAgregarAlCarrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPaneTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jScrollPaneDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jPanelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPaneTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelImagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPaneDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanelBotones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );
    }
//    public void eventos(){
//        jButtonAgregarAlCarrito.addActionListener(modelo.getVentana().getControl());
//        jButtonModificar.addActionListener(modelo.getVentana().getControl());
//    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 404, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
