/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b28ej1;

import javax.swing.JOptionPane;

/**
 *
 * @author quique
 */
public class B28ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Alumno al = new Alumno();

        int op = Integer.parseInt(JOptionPane.showInputDialog("1.- Mostrar todo\n2.-Cambiar Nota\n3.-Cambiar Direccion"));
        while (op == 1 || op == 2 || op == 3) {
            switch (op) {

                case 1:
                    System.out.println(al.toString());
                    al.mostrar();
                    break;
                case 2:
                    al.cambiarNota();
                    break;
                case 3:
                    al.cambiar();
                    break;
                default:
                    System.exit(0);

            }

            op = Integer.parseInt(JOptionPane.showInputDialog("1.- Mostrar todo\n2.-Cambiar Nota\n3.-Cambiar Direccion"));
        }
    }

}
