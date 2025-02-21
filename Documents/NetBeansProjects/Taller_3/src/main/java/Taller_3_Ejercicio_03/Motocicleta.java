
package Taller_3_Ejercicio_03;

import javax.swing.JOptionPane;


    // Clase derivada Motocicleta sin @Override (mala practica)
class Motocicleta extends Vehiculo {
    
    void moverse() { // No tiene @Override, pero si sobrescribe el metodo
        JOptionPane.showMessageDialog(null, "La motocicleta se esta moviendo con motor.");
    }
}

