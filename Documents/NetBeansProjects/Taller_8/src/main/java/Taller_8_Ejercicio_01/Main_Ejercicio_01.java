
package Taller_8_Ejercicio_01;


import javax.swing.JOptionPane;

public class Main_Ejercicio_01 {
    public static void main(String[] args) {
        String marca = JOptionPane.showInputDialog("Introduce la marca del vehiculo:");
        int velocidadMaxima = Integer.parseInt(JOptionPane.showInputDialog("Introduce la velocidad maxima (km/h):"));
        int numeroDePuertas = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de puertas del coche:"));

        Coche coche = new Coche(marca, velocidadMaxima, numeroDePuertas);
        coche.mostrarInformacion();
    }
}
