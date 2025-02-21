
package Taller_04_Ejercicio_03;

import javax.swing.JOptionPane;

public class Private {
     private String marca;
    private String modelo;
    private int velocidadMaxima;

   
    public Private(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    // Método para demostrar intento de acceso incorrecto
    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null, "Marca: " + marca + "\nModelo: " + modelo + "\nVelocidad Máxima: " + velocidadMaxima);
    }
}


