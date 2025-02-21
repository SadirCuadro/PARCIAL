package Taller_04_Ejercicio_02;

public class main_Ejercicio_02 {
    public static void main(String[] args) {
        
        Coche miCoche = new Coche("Toyota", "Corolla", 180);
        
        // Intento de acceso directo a propiedades (provocara errores de compilacion)
        // miCoche.marca = "Honda"; // Error: marca es privada
        // miCoche.velocidadMaxima = 200; // Error: velocidadMaxima es privada
        
        // Uso de metodos para modificar valores
        miCoche.acelerar(20);
        miCoche.acelerar(-5); // Mostrara error en JOptionPane
    } 
}
