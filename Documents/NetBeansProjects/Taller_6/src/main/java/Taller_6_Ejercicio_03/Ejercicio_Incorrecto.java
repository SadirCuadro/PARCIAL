
package Taller_6_Ejercicio_03;


public class Ejercicio_Incorrecto {
     private int valor = 10;
    
    // Metodo estatico intentando acceder a una variable de instancia
    public static void metodoIncorrecto() {
        // JOptionPane.showMessageDialog(null, "Valor: " + valor); // Error de compilacion
    }
}

