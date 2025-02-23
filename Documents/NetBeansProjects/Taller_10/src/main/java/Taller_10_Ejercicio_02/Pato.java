
package Taller_10_Ejercicio_02;


import javax.swing.JOptionPane;

public class Pato implements Volador, Nadador {
     String nombre;

    public Pato(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void volar() {
        JOptionPane.showMessageDialog(null, nombre + " esta volando.");
    }

    @Override
    public void nadar() {
        JOptionPane.showMessageDialog(null, nombre + " esta nadando en el lago.");
    }

    public void mostrarDetalles() {
        JOptionPane.showMessageDialog(null, "Pato: " + nombre);
    }
}
