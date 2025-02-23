
package Taller_9_Ejercicio_02;


import javax.swing.JOptionPane;

public class Main_Ejercicio_02 {
    public static void main(String[] as) {
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del animal:");

        Animal animal = new Animal(nombre);

        animal.Detalles();
        animal.volar();
        animal.nadar();
    }
}
