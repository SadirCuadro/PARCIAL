
package Taller_6_Ejercicio_03;

import javax.swing.JOptionPane;


public class Main_ejercicio_03 {
     public static void main(String[] args) {
        int suma = MatematicasPruebas.suma(5, 3);
        int resta = MatematicasPruebas.resta(10, 4);
        int multiplicacion = MatematicasPruebas.multiplicacion(6, 7);
        double division = MatematicasPruebas.division(15, 3);
        
        JOptionPane.showMessageDialog(null, "Resultados:\nSuma: " + suma + "\nResta: " + resta + "\nMultiplicacion: " + multiplicacion + "\nDivisin: " + division);
        
        Ejercicio_Correcto ej = new Ejercicio_Correcto();
        ej.mostrarValor();
        Ejercicio_Correcto.metodoEstatico();
    }
}
