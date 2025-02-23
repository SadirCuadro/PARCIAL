
package Taller_7_Ejercicio_02;


import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public class Main_Ejercicio_02 {
    public static void main(String[] args) {
        String opcion = JOptionPane.showInputDialog("Elige el tipo de empleado:\n1. Gerente\n2. Vendedor");

        if (opcion.equals("1")) {
            String nombre = JOptionPane.showInputDialog("Introduce el nombre del gerente:");
            int salarioBase = Integer.parseInt(JOptionPane.showInputDialog("Introduce el salario base:"));
            int bono = Integer.parseInt(JOptionPane.showInputDialog("Introduce el bono:"));
            
            Gerente gerente = new Gerente(nombre, salarioBase, bono);
            gerente.mostrarDetalles();
            
        } else if (opcion.equals("2")) {
            String nombre = JOptionPane.showInputDialog("Introduce el nombre del vendedor:");
            int salarioBase = Integer.parseInt(JOptionPane.showInputDialog("Introduce el salario base:"));
            int ventas = Integer.parseInt(JOptionPane.showInputDialog("Introduce las ventas realizadas:"));
            int comision = Integer.parseInt(JOptionPane.showInputDialog("Introduce el porcentaje de comision:"));

            Vendedor vendedor = new Vendedor(nombre, salarioBase, ventas, comision);
            vendedor.mostrarDetalles();
            
        } else {
            JOptionPane.showMessageDialog(null, "Opcion no valida");
        }
    }
}
