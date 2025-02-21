
package Taller_04_Ejercicio_01;

import javax.swing.JOptionPane;


public class Estudiante {

  
     private String nombre;
    private int edad;
    private double notaPromedio;

    // Constructor
    public Estudiante(String nombre, int edad, double notaPromedio) {
        this.nombre = nombre;
        setEdad(edad);
        setNotaPromedio(notaPromedio);
    }

  
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad > 0) {
            this.edad = edad;
        } else {
            JOptionPane.showMessageDialog(null, "La edad debe ser mayor que 0 ");
        }
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        if (notaPromedio >= 0 && notaPromedio <= 10) {
            this.notaPromedio = notaPromedio;
        } else {
            JOptionPane.showMessageDialog(null, "La nota promedio debe estar entre 0 y 10 ");
        }
    }

    
    public void mostrarInfo() {
        String mensaje = "Nombre: " + nombre + "\nEdad: " + edad + "\nNota Promedio: " + notaPromedio;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
