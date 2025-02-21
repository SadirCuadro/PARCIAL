
package Taller_5_Ejercicio_01;

import javax.swing.JOptionPane;


public class Empleado {

   protected String nombre;
    protected int salario;

   
    public Empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

  
    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nSalario: " + salario);
    }
}




