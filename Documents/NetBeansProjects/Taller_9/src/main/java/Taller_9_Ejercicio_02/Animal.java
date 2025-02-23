
package Taller_9_Ejercicio_02;

import javax.swing.JOptionPane;

public class Animal implements Volador, Nadador {
    String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void volar() {
        JOptionPane.showMessageDialog(null, nombre + " esta volando por los cielos.");
    }

    @Override
    public void nadar() {
        JOptionPane.showMessageDialog(null, nombre + " esta nadando en el agua.");
    }

    public void Detalles() {
        JOptionPane.showMessageDialog(null, "Animal: " + nombre);
    }
}

