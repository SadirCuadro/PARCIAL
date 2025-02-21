
package Taller_5_Ejercicio_03;


    class Protected {
    private int saldo;

 
    public Protected(int saldoInicial) {
        this.saldo = saldoInicial;
    }

   
    public int getSaldo() {
        return saldo;
    }

    public void depositar(int cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
    }

    public boolean retirar(int cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }
}


