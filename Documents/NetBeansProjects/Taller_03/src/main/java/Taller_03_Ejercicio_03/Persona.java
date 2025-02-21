
package Taller_03_Ejercicio_03;

import javax.swing.JOptionPane;


public class Persona {
    private String nombre; 
    int edad;

    
    Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    void mostrarInfo() {
        String mensaje = "Nombre: " + nombre + "\nEdad: " + edad + " años";
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
