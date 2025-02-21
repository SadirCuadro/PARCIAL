
package Taller_6_Ejercicio_03;

import javax.swing.JOptionPane;



public class Ejercicio_Correcto {
       private int valor = 10;
    
    public void mostrarValor() {
        JOptionPane.showMessageDialog(null, "Valor: " + valor);
    }
    
    public static void metodoEstatico() {
        JOptionPane.showMessageDialog(null, "Este es un metodo estatico correcto");
    }
}
