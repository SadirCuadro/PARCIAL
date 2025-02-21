
package Taller_3_Ejercicio_01;

import javax.swing.JOptionPane;

public class Persona {
      private String nombre;
    int edad;

    // Constructor
    Persona(String nombre) {
        this.nombre = nombre;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    void presentarse() {
        JOptionPane.showMessageDialog(null, "Hola, soy Sadir Cuadro.");
    }
}


class Estudiante extends Persona {
    Estudiante(String nombre) {
        super(nombre);
    }

    @Override
    void presentarse() {
        JOptionPane.showMessageDialog(null, "Hola, soy un estudiante y mi nombre es " + getNombre() + ".");
    }
}


class Profesor extends Persona {
    Profesor(String nombre) {
        super(nombre);
    }

    @Override
    void presentarse() {
        JOptionPane.showMessageDialog(null, "Hola, soy un profesor y mi nombre es " + getNombre() + ".");
    }
}


