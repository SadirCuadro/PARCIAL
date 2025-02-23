
package Taller_08_Ejercicio_02;


import javax.swing.JOptionPane;

public class Main_Ejercicio_02 {
    public static void main(String[] ss) {
        String especie = JOptionPane.showInputDialog("Introduce la especie del pez:");
        String tipoDeAgua = JOptionPane.showInputDialog("Introduce el tipo de agua (dulce/salada):");

        Pez pez = new Pez(especie, tipoDeAgua);
        pez.Especie();
    }
}

