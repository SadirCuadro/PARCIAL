
package Taller_4_Ejercicio_01;

import javax.swing.JOptionPane;


public class Empleado {

       public String nombre;
    private double salario;

    
    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        setSalario(salario);
    }

    
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario > 0) {
            this.salario = salario;
        } else {
            JOptionPane.showMessageDialog(null, "El salario debe ser un valor positivo.");
        }
    }

   
    public void mostrarInfo() {
        String mensaje = "Nombre: " + nombre + "\nSalario: " + salario;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
