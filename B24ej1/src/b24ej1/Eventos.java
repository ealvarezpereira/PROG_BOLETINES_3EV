/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b24ej1;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author quique
 */
public class Eventos extends JFrame implements ActionListener {

    Graphics g;
    JFrame marco;
    JPanel panel;
    JButton dibuja, limpia;
    JTextField txt;

    public Eventos() {

        this.marco = new JFrame("Boletin 24");
        this.panel = new JPanel();
        this.txt = new JTextField(String.valueOf(0), 20);
        this.dibuja = new JButton("DIBUJAR");
        this.limpia = new JButton("LIMPIAR");

        this.marco.setSize(300, 400);

        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.dibuja.addActionListener(this);
        this.limpia.addActionListener(this);
        this.panel.add(txt);
        this.panel.add(dibuja);
        this.panel.add(limpia);
        this.marco.add(panel);
        marco.setVisible(true);

    }

    public void paint(Graphics g) {
        int x = 100;
        int y = 100;
        for (int i = 0; i < Integer.parseInt(txt.getText()); i++) {

            x = x+25;
            g.setColor(Color.RED);
            g.drawOval(x,y, 20, 20);
        }

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        Object boton = ae.getSource();

        if (boton.equals(dibuja)) {

            paint(panel.getGraphics());

        } else if (boton.equals(limpia)) {
            txt.setText(null);
            
            panel.repaint();
        }

    }
}
