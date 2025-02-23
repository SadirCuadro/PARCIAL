

package Taller_8_Ejercicio_01;


import javax.swing.JOptionPane;

public class Vehiculo {
    protected String marca;
    protected int velocidadMaxima;

    public Vehiculo(String marca, int velocidadMaxima) {
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, "Marca: " + marca + 
                                      "\nVelocidad Maxima: " + velocidadMaxima + " km/h");
    }
}

