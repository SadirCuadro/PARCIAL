
package Taller_4_Ejercicio_02;

import javax.swing.JOptionPane;


public class CuentaBanco {
    String numeroCuenta;
    private int saldo;
    public String tipoCuenta;

    
    public CuentaBanco(String numeroCuenta, int saldo, String tipoCuenta) {
        this.numeroCuenta = numeroCuenta;
        setSaldo(saldo);
        this.tipoCuenta = tipoCuenta;
    }

  
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            JOptionPane.showMessageDialog(null, "El saldo no puede ser negativo.");
        }
    }

    
    public void mostrarInfo() {
        String mensaje = "Numero de Cuenta: [No accesible]" + "\nSaldo: " + saldo + "\nTipo de Cuenta: " + tipoCuenta;
        JOptionPane.showMessageDialog(null, mensaje);
    }
}
