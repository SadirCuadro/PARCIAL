
package Taller_7_Ejercicio_03;

import javax.swing.JOptionPane;

abstract class Empleado {
    protected String nombre;
    protected int salarioBase;

    public Empleado(String nombre, int salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    public abstract int calcularSalario();

    public void mostrarDetalles() {
        JOptionPane.showMessageDialog(null, "Empleado: " + nombre + 
                                      "\nSalario: $" + calcularSalario());
    }
}