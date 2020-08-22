/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import Logica.Modelo;
import Controlador.Controlador;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 *
 * @author thord
 */
public class VentanaMenu extends javax.swing.JFrame {

    private Modelo modelo;
    private Controlador control;

    /**
     * Creates new form Menu
     */
    public VentanaMenu(Modelo aThis) {
        initComponents();
        this.modelo = aThis;
        eventos();
    }

    public void eventos() {
        jButtonComprar.addActionListener(getControl());
        jMenuItemIniciarSesion.addActionListener(getControl());
        jMenuItemCerrarSesion.addActionListener(getControl());
        jMenuItemModificarCatalogo.addActionListener(getControl());
        jMenuItemSalirApp.addActionListener(getControl());
        jMenuItemRegistrarNuevoUsuario.addActionListener(getControl());
    }

    public Modelo getModelo() {
        return modelo;
    }

    public Controlador getControl() {
        if (control == null) {
            this.control = new Controlador(this);
        }
        return control;
    }

    public JButton getjButtonComprar() {
        return jButtonComprar;
    }

    public void setjButtonComprar(JButton jButtonComprar) {
        this.jButtonComprar = jButtonComprar;
    }

    public JMenuItem getjMenuItemCerrarSesion() {
        return jMenuItemCerrarSesion;
    }

    public JMenuItem getjMenuItemRegistrarNuevoUsuario() {
        return jMenuItemRegistrarNuevoUsuario;
    }

    public void setjMenuItemRegistrarNuevoUsuario(JMenuItem jMenuItemRegistrarNuevoUsuario) {
        this.jMenuItemRegistrarNuevoUsuario = jMenuItemRegistrarNuevoUsuario;
    }
    
    

    public void setjMenuItemCerrarSesion(JMenuItem jMenuItemCerrarSesion) {
        this.jMenuItemCerrarSesion = jMenuItemCerrarSesion;
    }

    public JMenuItem getjMenuItemIniciarSesion() {
        return jMenuItemIniciarSesion;
    }

    public void setjMenuItemIniciarSesion(JMenuItem jMenuItemIniciarSesion) {
        this.jMenuItemIniciarSesion = jMenuItemIniciarSesion;
    }

    public JMenuItem getjMenuItemModificarCatalogo() {
        return jMenuItemModificarCatalogo;
    }

    public void setjMenuItemModificarCatalogo(JMenuItem jMenuItemModificarCatalogo) {
        this.jMenuItemModificarCatalogo = jMenuItemModificarCatalogo;
    }

    public JMenuItem getjMenuItemSalirApp() {
        return jMenuItemSalirApp;
    }

    public void setjMenuItemSalirApp(JMenuItem jMenuItemSalirApp) {
        this.jMenuItemSalirApp = jMenuItemSalirApp;
    }

    public JPanel getjPanelCarritoCompra() {
        return jPanelCarritoCompra;
    }

    public void setjPanelCarritoCompra(JPanel jPanelCarritoCompra) {
        this.jPanelCarritoCompra = jPanelCarritoCompra;
    }

    public JPanel getjPanelCatalogo() {
        return jPanelCatalogo;
    }

    public void setjPanelCatalogo(JPanel jPanelCatalogo) {
        this.jPanelCatalogo = jPanelCatalogo;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanelCatalogo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jPanelCarritoCompra = new javax.swing.JPanel();
        jButtonComprar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItemIniciarSesion = new javax.swing.JMenuItem();
        jMenuItemCerrarSesion = new javax.swing.JMenuItem();
        jMenuItemSalirApp = new javax.swing.JMenuItem();
        jMenuRegistrarNuevoUsuario = new javax.swing.JMenu();
        jMenuItemModificarCatalogo = new javax.swing.JMenuItem();
        jMenuItemRegistrarNuevoUsuario = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelCatalogo.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCatalogo.setPreferredSize(new java.awt.Dimension(845, 470));

        javax.swing.GroupLayout jPanelCatalogoLayout = new javax.swing.GroupLayout(jPanelCatalogo);
        jPanelCatalogo.setLayout(jPanelCatalogoLayout);
        jPanelCatalogoLayout.setHorizontalGroup(
            jPanelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 845, Short.MAX_VALUE)
        );
        jPanelCatalogoLayout.setVerticalGroup(
            jPanelCatalogoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 470, Short.MAX_VALUE)
        );

        jScrollPane1.setViewportView(jPanelCatalogo);

        jLabel1.setText("CATALOGO...");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Catalogo", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jPanelCarritoCompra.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCarritoCompra.setPreferredSize(new java.awt.Dimension(840, 438));

        javax.swing.GroupLayout jPanelCarritoCompraLayout = new javax.swing.GroupLayout(jPanelCarritoCompra);
        jPanelCarritoCompra.setLayout(jPanelCarritoCompraLayout);
        jPanelCarritoCompraLayout.setHorizontalGroup(
            jPanelCarritoCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 844, Short.MAX_VALUE)
        );
        jPanelCarritoCompraLayout.setVerticalGroup(
            jPanelCarritoCompraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 438, Short.MAX_VALUE)
        );

        jScrollPane2.setViewportView(jPanelCarritoCompra);

        jButtonComprar.setText("COMPRAR");

        jLabel2.setText("CARRITO DE COMPRAS:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonComprar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 368, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonComprar)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Carrito de compras", jPanel2);

        jLabel3.setText("Cargo:");

        jLabel4.setText("CARGO>...");

        jLabel5.setText("nombre:");

        jLabel6.setText("PEPITO PEREZ");

        jMenu1.setText("Menu");

        jMenuItemIniciarSesion.setText("Iniciar Sesion");
        jMenu1.add(jMenuItemIniciarSesion);

        jMenuItemCerrarSesion.setText("Cerrar Sesion");
        jMenu1.add(jMenuItemCerrarSesion);

        jMenuItemSalirApp.setText("Salir");
        jMenu1.add(jMenuItemSalirApp);

        jMenuBar1.add(jMenu1);

        jMenuRegistrarNuevoUsuario.setText("Herramientas");

        jMenuItemModificarCatalogo.setText("Modificar catalogo");
        jMenuRegistrarNuevoUsuario.add(jMenuItemModificarCatalogo);

        jMenuItemRegistrarNuevoUsuario.setText("Registrar nuevo usuario");
        jMenuRegistrarNuevoUsuario.add(jMenuItemRegistrarNuevoUsuario);

        jMenuBar1.add(jMenuRegistrarNuevoUsuario);

        jMenu2.setText("Ayuda");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addGap(26, 26, 26)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonComprar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jMenuItemCerrarSesion;
    private javax.swing.JMenuItem jMenuItemIniciarSesion;
    private javax.swing.JMenuItem jMenuItemModificarCatalogo;
    private javax.swing.JMenuItem jMenuItemRegistrarNuevoUsuario;
    private javax.swing.JMenuItem jMenuItemSalirApp;
    private javax.swing.JMenu jMenuRegistrarNuevoUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelCarritoCompra;
    private javax.swing.JPanel jPanelCatalogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}
