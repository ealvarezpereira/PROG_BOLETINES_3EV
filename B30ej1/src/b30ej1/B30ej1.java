/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b30ej1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quique
 */
public class B30ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        SeleccionFutbol entrenador;
        SeleccionFutbol futbolista;
        SeleccionFutbol masajista;
        SeleccionFutbol seleccionador;

        List<SeleccionFutbol> seleccion = new ArrayList<SeleccionFutbol>();

        seleccion.add((entrenador = new Entrenador(1, "Pepe", "Lopez", 35, 0054)));
        seleccion.add((futbolista = new Futbolista(2, "Juan", "Sanchez", 24, 6, "Delantero")));
        seleccion.add((masajista = new Masajista(3, "Wanda", "Cosmo", 45, "Doctor", 30)));
        seleccion.add((seleccionador = new Seleccionador(4, "Lola", "Lopez", 36)));

        for (int i = 0; i < seleccion.size(); i++) {
            seleccion.get(i).concentrarse();
            seleccion.get(i).entrenar();
            seleccion.get(i).jugarPartido();
            seleccion.get(i).viajar();
            System.out.println(seleccion.get(i).toString());
        }

    }

}
