
package Taller_7_Ejercicio_02;


public class Gerente extends Empleado {
     int bono;

    public Gerente(String nombre, int salarioBase, int bono) {
        super(nombre, salarioBase);
        this.bono = bono;
    }

     @Override
    public int calcularSalario() {
        return (int) (salarioBase + bono);
    }
}
