

package taller_03_Ejercicio_01;

import javax.swing.JOptionPane;


public class Producto {

   String nombre;
    int precio;
    int stock;

   
    Producto(String nombre, int precio, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    
    void mostrarInfo() {
        String mensaje = "Producto: " + nombre + "\nPrecio: $" + precio + "\nStock: " + stock + " unidades";
        JOptionPane.showMessageDialog(null, mensaje);
    }
}

