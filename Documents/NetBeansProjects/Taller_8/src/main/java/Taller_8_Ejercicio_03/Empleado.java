
package Taller_8_Ejercicio_03;

import javax.swing.JOptionPane;

class Empleado {
    protected String nombre;
    protected int salario;

    public Empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrarDetalles() {
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + 
                                      "\nSalario: $" + salario);
    }
}

