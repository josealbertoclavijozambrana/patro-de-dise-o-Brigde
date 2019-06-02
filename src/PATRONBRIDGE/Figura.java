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
public abstract class Figura {

    protected Color colores;

    public Figura(Color colores) {
        this.colores = colores;
    }

    public abstract void Dibujar();

}
