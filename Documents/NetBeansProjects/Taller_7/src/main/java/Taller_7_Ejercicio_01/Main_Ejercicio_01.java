
package Taller_7_Ejercicio_01;


import javax.swing.JOptionPane;

public class Main_Ejercicio_01 {
    public static void main(String[] args) {
        String opcion = JOptionPane.showInputDialog("Elige una figura:\n1. Circulo\n2. Rectangulo");

        if (opcion.equals("1")) {
            double radio = Double.parseDouble(JOptionPane.showInputDialog("Introduce el radio del circulo:"));
            Circulo circulo = new Circulo(radio);
            circulo.mostrarArea();
        } else if (opcion.equals("2")) {
            double ancho = Double.parseDouble(JOptionPane.showInputDialog("Introduce el ancho del rectangulo:"));
            double alto = Double.parseDouble(JOptionPane.showInputDialog("Introduce el alto del rectangulo:"));
            Rectangulo rectangulo = new Rectangulo(ancho, alto);
            rectangulo.mostrarArea();
        } else {
            JOptionPane.showMessageDialog(null, "Opcion no valida");
        }
    }
}
