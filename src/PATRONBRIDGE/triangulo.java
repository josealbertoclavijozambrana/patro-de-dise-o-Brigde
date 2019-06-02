/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PATRONBRIDGE;

/**
 *
 * @author JoseClavijo
 */
public class triangulo extends Figura {

    public triangulo(Color colores) {
        super(colores);
    }

    @Override
    public void Dibujar() {
        System.out.println("Soy un Triangulo");
        colores.pintar();
    }

}
