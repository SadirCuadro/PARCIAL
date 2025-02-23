
package Taller_8_Ejercicio_01;

import javax.swing.JOptionPane;

class Coche extends Vehiculo {
    private int numeroDePuertas;

    public Coche(String marca, int velocidadMaxima, int numeroDePuertas) {
        super(marca, velocidadMaxima);
        this.numeroDePuertas = numeroDePuertas;
    }

    @Override
    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, "Marca: " + marca + 
                                      "\nVelocidad Maxima: " + velocidadMaxima + " km/h" + 
                                      "\nNumero de Puertas: " + numeroDePuertas);
    }
}
