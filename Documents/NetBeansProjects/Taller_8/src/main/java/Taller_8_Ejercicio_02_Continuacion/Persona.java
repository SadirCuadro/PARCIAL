
package Taller_8_Ejercicio_02_Continuacion;

import javax.swing.JOptionPane;

public class Persona {
    protected String nombre;
    protected int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void Detalles() {
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + 
                                      "\nEdad: " + edad + " años");
    }
}
