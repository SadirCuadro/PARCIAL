
package Taller_8_Ejercicio_02_Continuacion;


import javax.swing.JOptionPane;

public class Main_Ejercicio_02 {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del estudiante:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del estudiante:"));
        String matricula = JOptionPane.showInputDialog("Introduce la matricula del estudiante:");

        Estudiante estudiante = new Estudiante(nombre, edad, matricula);
        estudiante.Detalles();
    }
}

