
package Taller_01_Ejercicio_02;


import javax.swing.JOptionPane;
public class CuentaBancaria {
    String numeroCuenta;
    int saldo;
    String tipoCuenta;

   
    public CuentaBancaria() {
     
    }

    // Constructor con dos parametros
    public CuentaBancaria(String numeroCuenta, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 0;
        this.tipoCuenta = tipoCuenta;
    }

    // Constructor sobrecargado con tres parametros
    public CuentaBancaria(String numeroCuenta, int saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.tipoCuenta = tipoCuenta;
    }

    
    public void Detalles() {
       String mensaje = "Cuenta Bancaria\n" + "Numeros de Cuenta: " + numeroCuenta + "\n" + "Saldo unico es de: $" + saldo + "\n" + "Tipo de Cuenta: " + tipoCuenta;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

