
package Taller_6_Ejercicio_01;


public class Main_Ejercicio_01 {
      public static void main(String[] args) {
        Coche coche1 = new Coche("Toyota", "Corolla");
        Coche coche2 = new Coche("Honda", "Civic");
        Coche coche3 = new Coche("Ford", "Focus");
        
        coche1.mostrarInfo();
        coche2.mostrarInfo();
        coche3.mostrarInfo();
        
        Coche.mostrarContadorCoches();
    }
}
