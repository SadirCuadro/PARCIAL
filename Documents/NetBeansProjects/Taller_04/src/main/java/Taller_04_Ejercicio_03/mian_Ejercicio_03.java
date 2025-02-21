
package Taller_04_Ejercicio_03;



public class mian_Ejercicio_03 {
    public static void main(String[] args) {
      
        Private Coche = new Private("Toyota", "vip", 180);
        
        // Intento de acceso directo a propiedades privadas (provocara errores de compilacion)
        // Coche.marca = "Honda"; // Error: marca es privada
        // Coche.velocidadMaxima = 200; // Error: velocidadMaxima es privada
        
        
        Coche.mostrarInfo();
    }
}


