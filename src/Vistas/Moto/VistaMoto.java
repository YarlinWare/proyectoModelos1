/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas.Moto;

import Logica.Observer.Modelo;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author thord
 */
public abstract class VistaMoto extends javax.swing.JPanel implements Cloneable {

    protected javax.swing.JButton jButtonAgregarAlCarrito;
    protected javax.swing.JButton jButtonModificar;
    protected javax.swing.JLabel jLabelDescripcion;
    protected javax.swing.JLabel jLabelTituloMoto;
    protected javax.swing.JLabel jLabelImagen;
    protected javax.swing.JPanel jPanel1;
    protected javax.swing.JPanel jPanelBotones;
    protected javax.swing.JPanel jPanelDescripcion;
    protected javax.swing.JPanel jPanelImagen;
    protected javax.swing.JPanel jPanelTitulo;
    protected javax.swing.JScrollPane jScrollPaneDescripcion;
    protected javax.swing.JScrollPane jScrollPaneTitulo;

    protected javax.swing.JCheckBox jCheckBoxCasco;
    protected javax.swing.JCheckBox jCheckBoxChaleco;
    protected javax.swing.JLabel jLabel2;
    protected javax.swing.JLabel jLabel3;
    protected javax.swing.JLabel jLabelPrecio;
    protected javax.swing.JLabel jLabelTotal;
    protected javax.swing.JPanel jPanel2;
    protected javax.swing.JPanel jPanel3;
    protected javax.swing.JPanel jPanel4;
    protected javax.swing.JPanel jPanel5;
    protected javax.swing.JPanel jPanel6;
    protected javax.swing.JSpinner jSpinnerCantidad;
    protected javax.swing.JButton jButtonEliminar;


    protected Modelo modelo;
    protected String id;

    /**
     * Creates new form NewJPanel
     */
    public VistaMoto(Modelo aThis) {
        initComponents();
        jPanel1 = new javax.swing.JPanel();
        jScrollPaneTitulo = new javax.swing.JScrollPane();
        jPanelTitulo = new javax.swing.JPanel();
        jLabelTituloMoto = new javax.swing.JLabel();
        jPanelImagen = new javax.swing.JPanel();
        jScrollPaneDescripcion = new javax.swing.JScrollPane();
        jPanelDescripcion = new javax.swing.JPanel();
        jLabelDescripcion = new javax.swing.JLabel();
        jLabelImagen = new javax.swing.JLabel();
        jPanelBotones = new javax.swing.JPanel();
        jButtonModificar = new javax.swing.JButton();
        jButtonAgregarAlCarrito = new javax.swing.JButton();
        jSpinnerCantidad = new javax.swing.JSpinner();
        jPanel2 = new javax.swing.JPanel();
        jLabelPrecio = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabelTotal = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jCheckBoxCasco = new javax.swing.JCheckBox();
        jCheckBoxChaleco = new javax.swing.JCheckBox();
        jButtonEliminar = new javax.swing.JButton();
        this.modelo = aThis;
        this.setSize(new Dimension(845, 200));
        
    }

    public JLabel getjLabelPrecio() {
        return jLabelPrecio;
    }

    public void setjLabelPrecio(JLabel jLabelPrecio) {
        this.jLabelPrecio = jLabelPrecio;
    }
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setClassName() {
        jButtonAgregarAlCarrito.setName(getId() + "-jButtonAgregarAlCarrito");
        jButtonEliminar.setName(getId() + "-jButtonEliminar");
        jButtonModificar.setName(getId() + "-jButtonModificar");
        jSpinnerCantidad.setName(getId() + "-snipper");
        jCheckBoxCasco.setName(getId()+"-checkBoxCasco");
        jCheckBoxChaleco.setName(getId()+"-checkBoxChaleco");
        
        
    }

    public void eventos() {
        jButtonAgregarAlCarrito.addActionListener(modelo.getVentana().getControl());
        jButtonModificar.addActionListener(modelo.getVentana().getControl());
        jSpinnerCantidad.addChangeListener(modelo.getVentana().getControl());
        jCheckBoxCasco.addActionListener(modelo.getVentana().getControl());
        jCheckBoxChaleco.addActionListener(modelo.getVentana().getControl());
        jButtonEliminar.addActionListener(modelo.getVentana().getControl());
    }

    public JCheckBox getjCheckBoxExploradoras() {
        return jCheckBoxCasco;
    }

    public void setjCheckBoxCasco(JCheckBox jCheckBoxCasco) {
        this.jCheckBoxCasco = jCheckBoxCasco;
    }

    public JCheckBox getjCheckBoxMaletero() {
        return jCheckBoxChaleco;
    }

    public void setjCheckBoxChaleco(JCheckBox jCheckBoxChaleco) {
        this.jCheckBoxChaleco = jCheckBoxChaleco;
    }

    public JLabel getjLabelTotal() {
        return jLabelTotal;
    }

    public void setjLabelTotal(JLabel jLabelTotal) {
        this.jLabelTotal = jLabelTotal;
    }

    public JSpinner getjSpinnerCantidad() {
        return jSpinnerCantidad;
    }

    public void setjSpinnerCantidad(JSpinner jSpinnerCantidad) {
        this.jSpinnerCantidad = jSpinnerCantidad;
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

    public JButton getjButtonAgregarAlCarrito() {
        return jButtonAgregarAlCarrito;
    }

    public void setjButtonAgregarAlCarrito(JButton jButtonAgregarAlCarrito) {
        this.jButtonAgregarAlCarrito = jButtonAgregarAlCarrito;
    }

    public JButton getjButtonModificar() {
        return jButtonModificar;
    }

    public void setjButtonModificar(JButton jButtonModificar) {
        this.jButtonModificar = jButtonModificar;
    }

    public JLabel getjLabelDescripcion() {
        return jLabelDescripcion;
    }

    public void setjLabelDescripcion(JLabel jLabelDescripcion) {
        this.jLabelDescripcion = jLabelDescripcion;
    }

    public JPanel getjPanelBotones() {
        return jPanelBotones;
    }

    public void setjPanelBotones(JPanel jPanelBotones) {
        this.jPanelBotones = jPanelBotones;
    }

    public JPanel getjPanelDescripcion() {
        return jPanelDescripcion;
    }

    public void setjPanelDescripcion(JPanel jPanelDescripcion) {
        this.jPanelDescripcion = jPanelDescripcion;
    }

    public JPanel getjPanelImagen() {
        return jPanelImagen;
    }

    public void setjPanelImagen(JPanel jPanelImagen) {
        this.jPanelImagen = jPanelImagen;
    }

    public JPanel getjPanelTitulo() {
        return jPanelTitulo;
    }

    public void setjPanelTitulo(JPanel jPanelTitulo) {
        this.jPanelTitulo = jPanelTitulo;
    }

    public JScrollPane getjScrollPaneDescripcion() {
        return jScrollPaneDescripcion;
    }

    public void setjScrollPaneDescripcion(JScrollPane jScrollPaneDescripcion) {
        this.jScrollPaneDescripcion = jScrollPaneDescripcion;
    }

    public JScrollPane getjScrollPaneTitulo() {
        return jScrollPaneTitulo;
    }

    public void setjScrollPaneTitulo(JScrollPane jScrollPaneTitulo) {
        this.jScrollPaneTitulo = jScrollPaneTitulo;
    }

    public JLabel getjLabelImagen() {
        return jLabelImagen;
    }

    public void setjLabelImagen(JLabel jLabelImagen) {
        this.jLabelImagen = jLabelImagen;
    }

    public void configSnipper(int min, int max){
        SpinnerNumberModel nm = new SpinnerNumberModel();
        nm.setMaximum(max);
        nm.setMinimum(min);
        nm.setStepSize(1);
        jSpinnerCantidad.setModel(nm);
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
