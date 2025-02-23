
package Taller_08_Ejercicio_01;


import javax.swing.JOptionPane;

public class Main_Ejercicio_01 {
    public static void main(String[] sa) {
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del empleado:");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("Introduce la edad del empleado:"));
        String departamento = JOptionPane.showInputDialog("Introduce el departamento del empleado:");

        Empleado empleado = new Empleado(nombre, edad, departamento);
        empleado.mostrarDetalles();
    }
}
