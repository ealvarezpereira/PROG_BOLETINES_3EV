/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b29ej1;

import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class Velero extends Barco {

    int mastiles;

    public Velero(int mastiles, float eslora, String matricula, int dias) {

        super(eslora, matricula, dias);
        this.mastiles = mastiles;
    }

    @Override
    public void aluguer(Barco b) {
        JOptionPane.showMessageDialog(null, "Precio: "+(dias*(10*eslora+mastiles*2))+"€");        
    }

}
