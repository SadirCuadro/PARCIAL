
package Taller_10_Ejercicio_02;

import javax.swing.JOptionPane;

public class Main_Ejercicio_02 {
    public static void main(String[] sss) {
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del pato:");

        Pato pato = new Pato(nombre);

        pato.mostrarDetalles();
        pato.volar();
        pato.nadar();
    }
}

