
package Taller_6_Ejercicio_02;

import javax.swing.JOptionPane;


class Matematicas {
    public static int suma(int a, int b) {
        return a + b;
    }
    
    public static int resta(int a, int b) {
        return a - b;
    }
    
    public static int multiplicacion(int a, int b) {
        return a * b;
    }
    
    public static double division(double a, double b) {
        if (b == 0) {
            JOptionPane.showMessageDialog(null, "Error: No se puede dividir por cero.");
            return 0;
        }
        return a / b;
    }
}
