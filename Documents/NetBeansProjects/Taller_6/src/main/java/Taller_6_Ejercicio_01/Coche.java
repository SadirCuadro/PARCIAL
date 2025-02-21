
package Taller_6_Ejercicio_01;

import javax.swing.JOptionPane;


class Coche {
    private String marca;
    private String modelo;
    private static int contadorCoches = 0;

   
    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        contadorCoches++;
    }

  
    public void mostrarInfo() {
        JOptionPane.showMessageDialog(null, "Marca: " + marca + "\nModelo: " + modelo);
    }

    
    public static void mostrarContadorCoches() {
        JOptionPane.showMessageDialog(null, "Numero total de coches creados: " + contadorCoches);
    }
}

  

