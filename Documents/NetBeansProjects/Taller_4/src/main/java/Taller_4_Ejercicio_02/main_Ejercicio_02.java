
package Taller_4_Ejercicio_02;

public class main_Ejercicio_02 {
     public static void main(String[] args) {
        // Creando instancia de CuentaBancaria
        CuentaBanco cuenta = new CuentaBanco("123456789", 1500, "Ahorro");
        
        // Intento de acceso directo a numeroCuenta (provocara error de compilacion)
        // cuenta.numeroCuenta = "987654321"; //numeroCuenta es privada
        
        
        cuenta.mostrarInfo();
}
}