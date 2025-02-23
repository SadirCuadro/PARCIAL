
package Taller_9_Ejercicio_01;




import javax.swing.JOptionPane;

public class Main_Ejercicio_01 {
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog("Introduce el nombre del ave:");

        Ave ave = new Ave(nombre);

        ave.Detalles();
        ave.volar();
        ave.cantar();
    }
}
