
package Taller_03_Ejercicio_02;

public class Vehiculo {
   
    String tipo;
    public Vehiculo(String tipo) {
        this.tipo = tipo;
    }

    void mostrarInfo() { 
        javax.swing.JOptionPane.showMessageDialog(null, "Tipo de Vehículo: " + tipo);
    }
} 

