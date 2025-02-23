
package Taller_7_Ejercicio_02;

import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

public abstract class Empleado {
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


