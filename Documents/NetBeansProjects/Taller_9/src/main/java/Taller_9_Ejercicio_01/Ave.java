

package Taller_9_Ejercicio_01;

import javax.swing.JOptionPane;

public class Ave implements Volador, Cantante {
     String nombre;

    public Ave(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void volar() {
        JOptionPane.showMessageDialog(null, nombre + " esta volando alto en el cielo.");
    }

    @Override
    public void cantar() {
        JOptionPane.showMessageDialog(null, nombre + " esta cantando una hermosa melodia.");
    }

    public void Detalles() {
        JOptionPane.showMessageDialog(null, "Ave: " + nombre);
    }
}
