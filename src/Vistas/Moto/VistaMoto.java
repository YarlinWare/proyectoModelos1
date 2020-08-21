/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Moto;

import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author thord
 */
public abstract class VistaMoto extends javax.swing.JPanel implements  Cloneable{

    JPanel jPanel1;
    JLabel jLabelTituloMoto;
    JLabel jLabelImagenMoto;
    JLabel jLabelDescripcionMoto;
    JButton jButtonModificarMoto;
    JButton jButtonAgregarMoto;

    /**
     * Creates new form NewJPanel
     */
    public VistaMoto() {
        jPanel1 = new javax.swing.JPanel();
        jLabelTituloMoto = new javax.swing.JLabel();
        jLabelImagenMoto = new javax.swing.JLabel();
        jLabelDescripcionMoto = new javax.swing.JLabel();
        jButtonModificarMoto = new javax.swing.JButton();
        jButtonAgregarMoto = new javax.swing.JButton();
        this.setSize(new Dimension(845, 200));
        inicializar();
    }

    public JPanel getjPanel1() {
        return jPanel1;
    }

    public void setjPanel1(JPanel jPanel1) {
        this.jPanel1 = jPanel1;
    }

    public JLabel getjLabelTituloMoto() {
        return jLabelTituloMoto;
    }

    public void setjLabelTituloMoto(JLabel jLabelTituloMoto) {
        this.jLabelTituloMoto = jLabelTituloMoto;
    }

    public JLabel getjLabelImagenMoto() {
        return jLabelImagenMoto;
    }

    public void setjLabelImagenMoto(JLabel jLabelImagenMoto) {
        this.jLabelImagenMoto = jLabelImagenMoto;
    }

    public JLabel getjLabelDescripcionMoto() {
        return jLabelDescripcionMoto;
    }

    public void setjLabelDescripcionMoto(JLabel jLabelDescripcionMoto) {
        this.jLabelDescripcionMoto = jLabelDescripcionMoto;
    }

    public JButton getjButtonModificarMoto() {
        return jButtonModificarMoto;
    }

    public void setjButtonModificarMoto(JButton jButtonModificarMoto) {
        this.jButtonModificarMoto = jButtonModificarMoto;
    }

    public JButton getjButtonAgregarMoto() {
        return jButtonAgregarMoto;
    }

    public void setjButtonAgregarMoto(JButton jButtonAgregarMoto) {
        this.jButtonAgregarMoto = jButtonAgregarMoto;
    }
   

    public void inicializar() {
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(100, 100));

        jLabelTituloMoto.setText("TITULO");

        jLabelImagenMoto.setText("IMAGEN....");

        jLabelDescripcionMoto.setText("Descripcion...");

        jButtonModificarMoto.setText("Modificar");

        jButtonAgregarMoto.setText("Agregar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelImagenMoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabelTituloMoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addGap(30, 30, 30))
                                                        .addComponent(jLabelDescripcionMoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(158, 158, 158))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButtonModificarMoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButtonAgregarMoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabelTituloMoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelImagenMoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelDescripcionMoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(63, 63, 63)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonAgregarMoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButtonModificarMoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 244, Short.MAX_VALUE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                                .addContainerGap())
        );
    }

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
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
