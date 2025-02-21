
package Taller_3_Ejercicio_03;

public class main_Ejercicio_03 {
    public static void main(String[] args) {
       
        Vehiculo vehiculo = new Vehiculo();
        Vehiculo bicicleta = new Motocicleta();
        Vehiculo motocicleta = new Motocicleta();

        
        
        vehiculo.moverse();
        bicicleta.moverse(); // Esto compilara, pero moverse(String) no es sobrescritura
        motocicleta.moverse(); // Compilara, pero sin @Override no hay verificación del compilador
    }
}
