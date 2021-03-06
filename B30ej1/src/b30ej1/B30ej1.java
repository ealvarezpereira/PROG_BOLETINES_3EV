/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b30ej1;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class B30ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<SeleccionFutbol> seleccion = new ArrayList<SeleccionFutbol>();

        seleccion.add(new Entrenador(1, "Pepe", "Lopez", 35, 0054));
        seleccion.add(new Futbolista(2, "Juan", "Sanchez", 24, 6, "Delantero"));
        seleccion.add(new Masajista(3, "Wanda", "Cosmo", 45, "Doctor", 30));
        seleccion.add(new Seleccionador(4, "Lola", "Lopez", 36));
      
        for (SeleccionFutbol sel : seleccion) {
            JOptionPane.showMessageDialog(null, sel.toString());
            sel.concentrarse();
            sel.entrenar();
            sel.jugarPartido();
            sel.viajar();
        }

    }

}
