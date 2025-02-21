
package Taller_6_Ejercicio_02;

import javax.swing.JOptionPane;

public class Main_Ejercicio_02 {
     public static void main(String[] args) {
        int suma = Matematicas.suma(5, 3);
        int resta = Matematicas.resta(10, 4);
        int multiplicacion = Matematicas.multiplicacion(6, 7);
        double division = Matematicas.division(15, 3);
        
        JOptionPane.showMessageDialog(null, "Resultados:\nSuma: " + suma + "\nResta: " + resta + "\nMultiplicacion: " + multiplicacion + "\nDivision: " + division);
    }
}
