/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b32ej1;

import java.sql.SQLException;

/**
 *
 * @author quique
 */
public class B32ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        BaseDatos bd = new BaseDatos();
        
        bd.setVisible(true);
    }
    
}
