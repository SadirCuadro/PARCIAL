
package Taller_5_Ejercicio_01;

import javax.swing.JOptionPane;



    
class Gerente extends Empleado {
    private String departamento;

    
    public Gerente(String nombre, int salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

   
    @Override
    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + "\nSalario: " + salario + "\nDepartamento: " + departamento);
    }
}
