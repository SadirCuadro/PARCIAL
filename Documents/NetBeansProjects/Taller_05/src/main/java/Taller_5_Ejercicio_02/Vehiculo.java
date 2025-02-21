
package Taller_5_Ejercicio_02;

import javax.swing.JOptionPane;

public class Vehiculo {
     protected String tipo;
    protected String marca;


    public Vehiculo(String tipo, String marca) {
        this.tipo = tipo;
        this.marca = marca;
    }

  
    public void mostrarInformacion() {
        JOptionPane.showMessageDialog(null, "Tipo: " + tipo + "\nMarca: " + marca);
    }
}

