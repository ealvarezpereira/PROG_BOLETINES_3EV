/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b23ej3;

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
    JButton hola, adios;
    JLabel txt;

    public Eventos() {

        this.marco = new JFrame("CURSO DAM");
        this.panel = new JPanel();
        this.txt = new JLabel();
        this.hola = new JButton("Saludo");
        this.adios = new JButton("Despedida");

        this.marco.setSize(300, 100);

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.hola.addActionListener(this);
        this.adios.addActionListener(this);
        this.panel.add(hola);
        this.panel.add(adios);
        this.panel.add(txt);
        this.marco.add(panel);

        this.txt.setVisible(false);
        marco.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        Object boton = ae.getSource();

        if (boton.equals(hola)) {
            this.txt.setVisible(true);
            txt.setText("Un saludo a DAM");
        } else if (boton.equals(adios)) {
            this.txt.setVisible(true);
            txt.setText("Fin del programa");
        }
    }

}
