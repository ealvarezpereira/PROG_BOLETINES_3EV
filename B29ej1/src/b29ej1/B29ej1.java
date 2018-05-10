/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package b29ej1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author quique
 */
public class B29ej1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        List<Barco> barcos = new ArrayList();

        Barco v = new Velero(2, 35.2f, "YASS34", 7);
        Barco d = new Deportivo(150, 15.5f, "ATOPE23", 10);
        Barco y = new Yate(7740, 5, 44f, "MONEY69", 1);

        barcos.add(v);
        barcos.add(d);
        barcos.add(y);

        for (Barco bfor : barcos) {
            bfor.aluguer(bfor);
        }
    }

}
