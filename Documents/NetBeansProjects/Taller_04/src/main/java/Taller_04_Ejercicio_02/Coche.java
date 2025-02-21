
package Taller_04_Ejercicio_02;

import javax.swing.JOptionPane;


    class Coche {
    private String marca;
    private String modelo;
    private int velocidadMaxima;

  
    public Coche(String marca, String modelo, int velocidadMaxima) {
        this.marca = marca;
        this.modelo = modelo;
        this.velocidadMaxima = velocidadMaxima;
    }

    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void acelerar(int incremento) {
        if (incremento > 0) {
            this.velocidadMaxima += incremento;
            JOptionPane.showMessageDialog(null, "La velocidad maxima ha aumentado a: " + velocidadMaxima + " km/h");
        } else {
            JOptionPane.showMessageDialog(null, "El incremento de velocidad debe ser positivo.");
        }
    }
    }

