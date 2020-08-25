/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Logica.Usuario;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Connection;

/**
 *
 * @author ASUS
 */
public class UsuarioDB {

    Connection cn = ConexionDB.getConnection();

    public UsuarioDB() {
        //cn = new ConexionDB();
    }

    public ResultSet getUsuarioByUsuario(String usuario){
        try {
            PreparedStatement pstm = cn.prepareStatement("SELECT * "
                    + " FROM usuario "
                    + " WHERE usuario = ? ");
            pstm.setString(1, usuario);
            

            ResultSet res = pstm.executeQuery();
            return res;
        } catch (Exception e) {
            return null;
        }

        /*
         res.close();	
         */
    }

    /**
     * trae todos los registros de la tabla Usuario
     */
    public ResultSet getUsuario() throws SQLException {
        PreparedStatement pstm = cn.prepareStatement("SELECT "
                + " cedula, "
                + " nombre, "
                + " correo, "
                + " usuario, "
                + " password, "
                + " telefono, "
                + " cargo "
                + " FROM usuario "
                + " ORDER BY nombre, usuario");

        ResultSet res = pstm.executeQuery();
        return res;
    }

    public String insertarUsuario(long cedula, String nombre, String correo, String cargo, String userName, char[] password, long telefono) {
        try {
            String password1 = "";
            for (int x = 0; x < password.length; x++) {
                password1 += password[x];
            }
            PreparedStatement pstm = cn.prepareStatement("insert into usuario "
                    + "(cedula, "
                    + " nombre,"
                    + " correo,"
                    + " usuario,"
                    + " password,"
                    + " telefono,"
                    + " cargo) "
                    + " values(?,?,?,?,?,?,?)");
            pstm.setLong(1, cedula);
            pstm.setString(2, nombre);
            pstm.setString(3, correo);
            pstm.setString(4, userName);
            pstm.setString(5, password1);
            pstm.setLong(6, telefono);
            pstm.setString(7, cargo);

            pstm.executeUpdate();
            System.out.println("Usuario registrado");
            return "true";
        } catch (SQLException e) {
            System.out.println(e);
            return e.getMessage();

        }

    }

    public void actualizarUsuario(Usuario m) {

        try {
            PreparedStatement pstm = cn.prepareStatement("update usuario set "
                    + " nombre = ?, "
                    + " correo = ?,"
                    + " usuario = ?,"
                    + " password = ?,"
                    + " telefono = ?,"
                    + " cargo = ?"
                    + " where cedula = ?");
            pstm.setString(1, m.getNombre());
            pstm.setString(2, m.getCorreo());
            pstm.setString(3, m.getUsername());
            pstm.setString(4, m.getPassword());
            pstm.setLong(5, m.getTelefono());
            pstm.setString(6, m.getCargo());
            pstm.setLong(7, m.getCedula());

            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void borrarUsuario(Usuario m) {

        try {
            PreparedStatement pstm = cn.prepareStatement("delete from usuario "
                    + " where cedula = ?");

            pstm.setLong(1, m.getCedula());

            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }

    }

}
