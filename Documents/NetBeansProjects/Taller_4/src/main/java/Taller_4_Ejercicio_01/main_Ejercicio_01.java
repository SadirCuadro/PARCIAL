
package Taller_4_Ejercicio_01;


public class main_Ejercicio_01 {
       public static void main(String[] args) {
       
        Empleado emd1 = new Empleado("Carlos", 2500);
        Empleado emd2 = new Empleado("Maria", -500); // Mostrara error de validacion

       emd2.mostrarInfo();
        emd1.mostrarInfo();
    }
}
