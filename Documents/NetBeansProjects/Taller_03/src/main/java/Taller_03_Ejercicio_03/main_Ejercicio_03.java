
package Taller_03_Ejercicio_03;

public class main_Ejercicio_03 {
    
 public static void main(String[] args) {
        
        Persona per1 = new Persona("Juan", 30);
        
        // Accediendo al atributo de paquete directamente (edad)
        per1.edad = 35;

        // No podemos acceder directamente a 'nombre' porque es privado
        // persona1.nombre = "Carlos"; // Esto daría error

        // Usamos los metodos get y set para modificar el nombre
        per1.setNombre("Carlos");
        
        
        per1.mostrarInfo();
 }   
} 
