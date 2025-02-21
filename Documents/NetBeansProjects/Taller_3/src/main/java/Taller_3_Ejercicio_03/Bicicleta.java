
package Taller_3_Ejercicio_03;

import javax.swing.JOptionPane;



    class Bicicleta extends Vehiculo {
    // Cambiamos la firma del metodo (error de compilacion)
    void moverse(String modo) {
        JOptionPane.showMessageDialog(null, "La bicicleta se esta moviendo en modo: " + modo);
    }
}
