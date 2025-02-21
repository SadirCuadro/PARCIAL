
package Taller_4_Ejercicio_03;

import javax.swing.JOptionPane;


public class main_Ejercicio_03 {
     public static void main(String[] args) {
        int num1 = 10, num2 = 5;
        
        int suma = Utilidades.suma(num1, num2);
        int resta = Utilidades.resta(num1, num2);
        int multiplicacion = Utilidades.multiplicacion(num1, num2);
        int division = Utilidades.division(num1, num2);
        
        
        String mensaje = "Suma: " + suma + "\nResta: " + resta + "\nMultiplicacion: " + multiplicacion + "\nDivision: " + division;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
