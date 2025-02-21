
package Taller_5_Ejercicio_03;

import javax.swing.JOptionPane;

public class Main_Ejercicio_03 {
     public static void main(String[] args) {
        
        Banco banco = new Banco(1000);
        banco.mostrarSaldo();

       
        Protected bancoSeguro = new Protected(2000);
        bancoSeguro.depositar(500);
        bancoSeguro.retirar(1000);
        JOptionPane.showMessageDialog(null, "Saldo seguro: " + bancoSeguro.getSaldo());
    }
}


