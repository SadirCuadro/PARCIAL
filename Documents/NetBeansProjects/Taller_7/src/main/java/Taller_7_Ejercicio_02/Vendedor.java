
package Taller_7_Ejercicio_02;


public class Vendedor extends Empleado {
     int ventas;
     int comision; 

    public Vendedor(String nombre, int salarioBase, int ventas, int comision) {
        super(nombre, salarioBase);
        this.ventas = ventas;
        this.comision = comision;
    }

    @Override
    public int calcularSalario() {
        return salarioBase + (ventas * comision / 100);
    }
}

