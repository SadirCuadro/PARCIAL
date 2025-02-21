
package Taller_5_Ejercicio_03;

import javax.swing.JOptionPane;



class CuentaCorriente extends Banco {
    private String titular;


    public CuentaCorriente(String titular, int saldoInicial) {
        super(saldoInicial);
        this.titular = titular;
    }

  
    @Override
    public void mostrarSaldo() {
        JOptionPane.showMessageDialog(null, "Titular: " + titular + "\nSaldo: " + saldo);
    }
}

