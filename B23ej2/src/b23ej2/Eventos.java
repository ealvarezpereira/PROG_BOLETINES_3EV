/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b23ej2;

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
    JButton pro;
    JButton bd;

    public Eventos() {

        this.marco = new JFrame("CURSO DAM");
        this.panel = new JPanel();
        this.pro = new JButton("Programacion");
        this.bd = new JButton("Bases de datos");

        this.marco.setSize(300, 100);

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.pro.addActionListener(this);
        this.bd.addActionListener(this);
        this.panel.add(pro);
        this.panel.add(bd);
        this.marco.add(panel);

        marco.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        Object boton = ae.getSource();

        if (boton.equals(pro)) {
            
            marco.setTitle("Programacion");
        } else if (boton.equals(bd)) {
            marco.setTitle("Bases de datos");
        }
    }
}
