/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b23ej4;

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
    JButton vent;

    public Eventos() {

        this.marco = new JFrame("Ventana Principal");
        this.panel = new JPanel();
        this.vent = new JButton("Nueva ventana");

        this.marco.setSize(300, 100);

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.vent.addActionListener(this);
        this.panel.add(vent);
        this.marco.add(panel);

        marco.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        marco = new JFrame("Nueva ventana");
        marco.setSize(300, 100);
        marco.setVisible(true);
    }
}
