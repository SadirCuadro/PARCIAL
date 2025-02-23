
package Taller_8_Ejercicio_03;

import javax.swing.JOptionPane;

public class Main_Ejercicio_03 {
    public static void main(String[] args) {
        String nombreEmpleado = JOptionPane.showInputDialog("Introduce el nombre del empleado:");
        int salarioEmpleado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el salario del empleado:"));

        Empleado empleado = new Empleado(nombreEmpleado, salarioEmpleado);
        empleado.mostrarDetalles();

        String nombreGerente = JOptionPane.showInputDialog("Introduce el nombre del gerente:");
        int salarioGerente = Integer.parseInt(JOptionPane.showInputDialog("Introduce el salario del gerente:"));
        String departamento = JOptionPane.showInputDialog("Introduce el departamento del gerente:");

        Gerente gerente = new Gerente(nombreGerente, salarioGerente, departamento);
        gerente.mostrarDetalles();
    }
}
