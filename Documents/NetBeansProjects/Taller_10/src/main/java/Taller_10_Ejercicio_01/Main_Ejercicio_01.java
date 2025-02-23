
package Taller_10_Ejercicio_01;

import javax.swing.JOptionPane;

public class Main_Ejercicio_01 {
    public static void main(String[] sss) {
        int ancho = Integer.parseInt(JOptionPane.showInputDialog("Introduce el ancho del rectangulo:"));
        int alto = Integer.parseInt(JOptionPane.showInputDialog("Introduce el alto del rectangulo:"));

        Rectangulo rectangulo = new Rectangulo(ancho, alto);
        rectangulo.Area();

        int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base del triangulo:"));
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura del triangulo:"));

        Triangulo triangulo = new Triangulo(base, altura);
        triangulo.mostraArea();
    }
}

