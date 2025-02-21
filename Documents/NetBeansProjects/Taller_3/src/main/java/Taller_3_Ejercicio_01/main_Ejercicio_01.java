
package Taller_3_Ejercicio_01;

public class main_Ejercicio_01 {
      public static void main(String[] args) {
       
        Persona persona = new Persona("Juan");
        Persona estudiante = new Estudiante("Carlos");
        Persona profesor = new Profesor("Maria");

        
        persona.presentarse();
        estudiante.presentarse();
        profesor.presentarse();
    }
}
