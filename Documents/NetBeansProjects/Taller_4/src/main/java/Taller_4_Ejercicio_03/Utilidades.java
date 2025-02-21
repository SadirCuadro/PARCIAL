
package Taller_4_Ejercicio_03;

import javax.swing.JOptionPane;


public class Utilidades {
      public static int suma(int a, int b) {
        return a + b;
    }
    
    public static int resta(int a, int b) {
        return a - b;
    }
    
    public static int multiplicacion(int a, int b) {
        return a * b;
    }
    
    public static int division(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            JOptionPane.showMessageDialog(null, "No se puede dividir por cero.");
            return 0;
        }
    }
}
