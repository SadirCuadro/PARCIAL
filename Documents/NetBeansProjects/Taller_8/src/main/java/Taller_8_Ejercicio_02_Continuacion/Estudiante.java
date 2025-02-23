

package Taller_8_Ejercicio_02_Continuacion;

import javax.swing.JOptionPane;

class Estudiante extends Persona {
    private String matricula;

    public Estudiante(String nombre, int edad, String matricula) {
        super(nombre, edad);
        this.matricula = matricula;
    }

    @Override
    public void Detalles() {
        JOptionPane.showMessageDialog(null, "Nombre: " + nombre + 
                                      "\nEdad: " + edad + " años" + 
                                      "\nMatrícula: " + matricula);
    }
}

