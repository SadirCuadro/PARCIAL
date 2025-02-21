
package Taller_5_Ejercicio_01;

public class main_Ejercicio_01 {
    
      public static void main(String[] args) {
        Empleado empleado = new Empleado("judas", 700000);
        Gerente gerente = new Gerente("Sadir", 1200000, "Ing en Sistema");
        
       
        empleado.mostrarInformacion();
        gerente.mostrarInformacion();
    }
}
