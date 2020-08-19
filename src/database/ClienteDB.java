/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package database;

import Logica.Cliente;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author ASUS
 */
public class ClienteDB {
    ConexionDB cn;
    
    public ClienteDB() {
        //cn = new ConexionDB();
    }

    public ResultSet getClienteById(int id) throws SQLException {
        PreparedStatement pstm = cn.getConnection().prepareStatement("SELECT * "
                + " FROM tienda_moto.cliente "
                + " WHERE cedula = ? ");
        pstm.setInt(1, id);

        ResultSet res = pstm.executeQuery();
        /*
         res.close();	
         */

        return res;
    }

    /**
     * trae todos los registros de la tabla Cliente
     */
    public ResultSet getCliente() throws SQLException {
        PreparedStatement pstm = cn.getConnection().prepareStatement("SELECT "
                + " cedula, "
                + " nombre, "
                + " telefono, "
                + " correo, "
                + " direccion, "
                + " fecha_nac, "
                + " id_moto "
                + " FROM tienda_moto.cliente "
                + " ORDER BY nombre, cedula");


        ResultSet res = pstm.executeQuery();
        return res;
    }

    public void insertarCliente(Cliente m) {
        try {
            PreparedStatement pstm = cn.getConnection().prepareStatement("insert into tienda_moto.cliente "
                    + "(nombre, "
                    + " telefono, "
                    + " correo, "
                    + " direccion, "
                    + " fecha_nac, "
                    + " id_moto) "
                    + " values(?,?,?,?,?,?)");
            pstm.setString(1, m.getNombre());
            pstm.setInt(2, m.getTelefono());
            pstm.setString(3, m.getCorreo());
            pstm.setString(4, m.getDireccion());
            pstm.setString(5, m.getFecha_nacimiento());
            pstm.setInt(6, m.getId_moto());

            pstm.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e);
        }

    }
    
    public void actualizarCliente(Cliente m) {

        try {            
            PreparedStatement pstm = cn.getConnection().prepareStatement("update tienda_moto.usuario set "
                    + " nombre = ?, "
                    + " telefono = ?,"
                    + " correo = ?,"
                    + " direccion = ?,"
                    + " fech_nac = ?,"
                    + " id_moto = ?"
                    + " where cedula = ?");
            pstm.setString(1, m.getNombre());
            pstm.setInt(2, m.getTelefono());
            pstm.setString(3, m.getCorreo());
            pstm.setString(4, m.getDireccion());
            pstm.setString(5, m.getFecha_nacimiento());
            pstm.setInt(6, m.getId_moto());
            pstm.setInt(7, m.getCedula());
            
            

            pstm.executeUpdate();


        } catch (SQLException e) {
            System.out.println(e);
        }

    }

    public void borrarCliente(Cliente m) {

        try {
            PreparedStatement pstm = cn.getConnection().prepareStatement("delete from tienda_moto.cliente "
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
