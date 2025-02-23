
package Taller_7_Ejercicio_01;


  import javax.swing.JOptionPane;

public abstract class Figura {
    // Metodo abstracto
    public abstract double calcularArea();

    // Metodo para mostrar el area
    public void mostrarArea() {
        JOptionPane.showMessageDialog(null, "El area de la figura es: " + calcularArea());
    }
}



