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
public class Yate extends Barco {

    float potencia;   
    int camarotes;

    public Yate(float potencia, int camarotes, float eslora, String matricula, int dias) {
        super(eslora,matricula,dias);
        this.potencia = potencia;
        this.camarotes = camarotes;
    } 
    
    
    @Override
    public void aluguer(Barco b) {
                JOptionPane.showMessageDialog(null, "Precio: "+(dias*(10*eslora+potencia*3+camarotes*4))+"€");
    }

}
