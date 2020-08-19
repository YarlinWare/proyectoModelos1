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
    ConexionDB cn;
    
    public UsuarioDB() {
        //cn = new ConexionDB();
    }

    public ResultSet getMotoById(int id) throws SQLException {
        PreparedStatement pstm = cn.getConnection().prepareStatement("SELECT * "
                + " FROM tienda_moto.moto "
                + " WHERE idmoto = ? ");
        pstm.setInt(1, id);

        ResultSet res = pstm.executeQuery();
        /*
         res.close();	
         */

        return res;
    }

    /**
     * trae todos los registros de la tabla Moto
     */
    public ResultSet getMoto() throws SQLException {
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

    public void insertarMoto(Usuario m) {
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
    
    public void actualizarMoto(Usuario m) {

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

    public void borrarMoto(Usuario m) {

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
