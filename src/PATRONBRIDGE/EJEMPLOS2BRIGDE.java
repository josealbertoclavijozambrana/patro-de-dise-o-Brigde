/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PATRONBRIDGE;

import com.sun.xml.internal.ws.api.pipe.Fiber;
import java.util.ArrayList;

/**
 *
 * @author JoseClavijo
 */
public class EJEMPLOS2BRIGDE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new triangulo(new Azul()));
        figuras.add(new Rectangulo(new Rojo()));
        figuras.add(new triangulo(new Amarrillo()));
        for (Figura figuritas : figuras) {
            figuritas.Dibujar();
        }
    }

}
