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
/**
 *
 * @author ASUS
 */
public class UsuarioDB {
    ConexionDB cn = ConexionDB.getInstance();
    
    public UsuarioDB() {
        //cn = new ConexionDB();
    }

    public ResultSet getUsuarioById(int id) throws SQLException {
        PreparedStatement pstm = cn.getConnection().prepareStatement("SELECT * "
                + " FROM tienda_moto.usuario "
                + " WHERE cedula = ? ");
        pstm.setInt(1, id);

        ResultSet res = pstm.executeQuery();
        /*
         res.close();	
         */

        return res;
    }

    /**
     * trae todos los registros de la tabla Usuario
     */
    public ResultSet getUsuario() throws SQLException {
        PreparedStatement pstm = cn.getConnection().prepareStatement("SELECT "
                + " cedula, "
                + " nombre, "
                + " correo, "
                + " usuario, "
                + " password, "
                + " telefono, "
                + " cargo "
                + " FROM tienda_moto.usuario "
                + " ORDER BY nombre, usuario");


        ResultSet res = pstm.executeQuery();
        return res;
    }

    public void insertarUsuario(Usuario m) {
        try {
            PreparedStatement pstm = cn.getConnection().prepareStatement("insert into tienda_moto.usuario "
                    + "(nombre, "
                    + " correo,"
                    + " usuario,"
                    + " password,"
                    + " telefono,"
                    + " cargo) "
                    + " values(?,?,?,?,?,?)");
            pstm.setString(1, m.getNombre());
            pstm.setString(2, m.getCorreo());
            pstm.setString(3, m.getUsername());
            pstm.setString(4, m.getPassword());
            pstm.setInt(5, m.getTelefono());
            pstm.setString(6, m.getCargo());

            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }

    }
    
    public void actualizarUsuario(Usuario m) {

        try {            
            PreparedStatement pstm = cn.getConnection().prepareStatement("update tienda_moto.usuario set "
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
            pstm.setInt(5, m.getTelefono());
            pstm.setString(6, m.getCargo());
            pstm.setInt(7, m.getCedula());
            
            

            pstm.executeUpdate();


        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void borrarUsuario(Usuario m) {

        try {
            PreparedStatement pstm = cn.getConnection().prepareStatement("delete from tienda_moto.usuario "
                    + " where cedula = ?");

            pstm.setInt(1, m.getCedula());

            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }


    }
    
    public String getMensaje() {
        return cn.getMensaje();
    }
}
