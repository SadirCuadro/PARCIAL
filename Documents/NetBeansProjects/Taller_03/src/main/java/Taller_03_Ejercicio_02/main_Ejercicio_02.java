
package Taller_03_Ejercicio_02;

import javax.swing.JOptionPane;


public class main_Ejercicio_02 {
    public static void main(String[] args) {
        Vehiculo vehiculo = new Vehiculo("Camión");
        Moto moto = new Moto("Deportiva");

     //Dado que esos miembros tienen acceso de paquete (default), no podemos acceder a ellos desde otro paquete.
     // muestro con un mensaje que no pude accerder
        javax.swing.JOptionPane.showMessageDialog(null, "No podemos acceder directamente a las propiedades y metodos con acceso de paquete desde otro paquete.");
    }
}
