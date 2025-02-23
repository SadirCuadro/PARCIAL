
package Taller_7_Ejercicio_01;


class Rectangulo extends Figura {
    double ancho;
    double alto;

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}
