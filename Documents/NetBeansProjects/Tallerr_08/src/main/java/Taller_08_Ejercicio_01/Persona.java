
package Taller_08_Ejercicio_01;

import javax.swing.JOptionPane;

class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void mostrarDetalles() {
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + 
                                      "\nEdad: " + edad + " años");
    }
}