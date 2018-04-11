/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b23ej1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author quique
 */
public class Eventos implements ActionListener {

    JFrame marco;
    JPanel panel;
    JLabel prendido;
    JButton pulsame;

    public Eventos() {

        this.marco = new JFrame("Ventana eventos");
        this.panel = new JPanel();
        this.prendido = new JLabel("Boton prendido");
        this.pulsame = new JButton("Pulsame");

        this.marco.setSize(300, 100);
        
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.pulsame.addActionListener(this);
        this.panel.add(pulsame);
        this.panel.add(prendido);
        prendido.setVisible(false);
        this.marco.add(panel);
        

        marco.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        prendido.setVisible(true);
        
    }
}
