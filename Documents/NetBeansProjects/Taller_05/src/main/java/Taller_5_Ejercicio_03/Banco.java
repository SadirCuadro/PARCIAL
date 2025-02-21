
package Taller_5_Ejercicio_03;

import javax.swing.JOptionPane;


public class Banco {
      protected int saldo;

    
    public Banco(int saldoInicial) {
        this.saldo = saldoInicial;
    }

   
    public void mostrarSaldo() {
        JOptionPane.showMessageDialog(null, "Saldo: " + saldo);
    }
}

