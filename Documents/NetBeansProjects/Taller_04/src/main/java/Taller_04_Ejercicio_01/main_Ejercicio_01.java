
package Taller_04_Ejercicio_01;


public class main_Ejercicio_01 {
     public static void main(String[] args) {
       
        Estudiante est1 = new Estudiante("Carlos", 20, 8.5);
        Estudiante est2 = new Estudiante("María", -5, 11); // mostrara errores al momento de correr el programa

       
        est1.mostrarInfo();
        est2.mostrarInfo();
    }
}
