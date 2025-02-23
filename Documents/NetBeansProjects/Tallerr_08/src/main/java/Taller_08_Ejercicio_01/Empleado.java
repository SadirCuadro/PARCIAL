
package Taller_08_Ejercicio_01;

import javax.swing.JOptionPane;

class Empleado extends Persona {
    private String departamento;

    public Empleado(String nombre, int edad, String departamento) {
        super(nombre, edad);
        this.departamento = departamento;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles(); // Llama al método de Persona
        JOptionPane.showMessageDialog(null, "Departamento: " + departamento);
    }
}
