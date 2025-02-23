
package Taller_10_Ejercicio_01;


import javax.swing.JOptionPane;

public class Rectangulo extends Figura {
     int ancho;
     int alto;

    public Rectangulo(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public int Area() {
        return ancho * alto;
    }

    public void mostraArea() {
        JOptionPane.showMessageDialog(null, "Area del rectangulo: " + Area());
    }
}
