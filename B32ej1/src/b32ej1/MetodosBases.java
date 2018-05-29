
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b32ej1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author quique
 */
public class MetodosBases {

    Connection conn;

    public void conexionBase() {

        try {
            String url = "jdbc:sqlite:" + "/home/quique/Documentos/BasesDatos/comercio.db";
            conn = DriverManager.getConnection(url);

        } catch (SQLException ex) {
            System.out.println("Error de conexion " + ex);
        }
    }

    String refProducto, cantidad, nombre, refPrecio, precio, numV;

    public void sacarDatosVentas(String texto) {
        
        try {
            Statement st = conn.createStatement();
            if (!texto.equals("")){
            ResultSet resulNumV = st.executeQuery("select numv from ventas where numv = " + texto);
            numV = resulNumV.getString(1);
            System.out.println("Numventa: " + numV);
            ResultSet resulRefPrd = st.executeQuery("select refProducto from ventas where numv = " + texto);
            refProducto = resulRefPrd.getString(1);
            System.out.println("refProducto: " + refProducto);
            resulRefPrd.close();

            ResultSet resulCant = st.executeQuery("select cantidad from ventas where refProducto = " + "'" + refProducto + "'");
            cantidad = resulCant.getString(1);
            System.out.println("Cantidad: " + cantidad);
            resulCant.close();
            st.close();
            }else{
                JOptionPane.showMessageDialog(null, "Campo vacío");
            }
        } catch (SQLException ex) {
            System.out.println("Error en el select de Ventas " + ex);
        }
    }

    public void sacarDatosProducto() {;
        try {
            Statement st = conn.createStatement();
            System.out.println(refProducto);
            ResultSet resulNom = st.executeQuery("select nombre from producto where refProducto = " + "'" + refProducto + "'");
            nombre = resulNom.getString(1);
            System.out.println("Nombre: " + nombre);
            resulNom.close();

            ResultSet resulRefPrec = st.executeQuery("select refPrecio from producto where refProducto = " + "'" + refProducto + "'");
            refPrecio = resulRefPrec.getString(1);
            System.out.println("RefPrecio: " + refPrecio);
            resulRefPrec.close();
            st.close();
        } catch (SQLException ex) {
            System.out.println("Error en el select de Productos. " + ex);
        }
    }

    public void sacarDatosPrecio() {
        try {
            Statement st = conn.createStatement();

            ResultSet resulPrecio = st.executeQuery("select precio from precios where refPrecio = " + "'" + refPrecio + "'");
            precio = resulPrecio.getString(1);
            System.out.println("Precio: " + precio);
            
            resulPrecio.close();
            st.close();
        } catch (SQLException ex) {
            System.out.println("Error en el select de Precio. " + ex);
        }
    }

    public void ingresarTicket() {

        BaseDatos bd = new BaseDatos();

        try {
            PreparedStatement pst = conn.prepareStatement("insert into ticket values(" + numV + "," + "'" + nombre
                    + "'," + "'" + (Integer.parseInt(cantidad) * Integer.parseInt(precio)) + "');");

            pst.executeUpdate();
            System.out.println("Realizado.");
            pst.close();
        } catch (SQLException ex) {
            System.out.println("Error al ingresar ticket. " + ex);
        }
    }

    public DefaultTableModel recargarTablas() {

        DefaultTableModel mimodelo = new DefaultTableModel();
        try {

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("select * from ticket");

            for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                mimodelo.addColumn(rs.getMetaData().getColumnName(i + 1));
            }

            while (rs.next()) {
                Object[] list = new Object[rs.getMetaData().getColumnCount()];

                for (int i = 0; i < rs.getMetaData().getColumnCount(); i++) {
                    list[i] = rs.getString(i + 1);
                }
                mimodelo.addRow(list);
            }

            st.close();
            rs.close();
        } catch (Exception ex) {
            System.out.println("Error al cargar la tabla. " + ex);
        }

        return mimodelo;

    }
}
