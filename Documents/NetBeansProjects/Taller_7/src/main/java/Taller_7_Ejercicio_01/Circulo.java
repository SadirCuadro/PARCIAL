
package Taller_7_Ejercicio_01;

class Circulo extends Figura {
    double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }
}
