
package Taller_10_Ejercicio_01;


import javax.swing.JOptionPane;

public class Triangulo extends Figura {
    private int base;
    private int altura;

    public Triangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public int Area() {
        return (base * altura) / 2;
    }

    public void mostraArea() {
        JOptionPane.showMessageDialog(null, "Área del triángulo: " + Area());
    }
}
