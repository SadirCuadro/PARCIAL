
package Taller_08_Ejercicio_02;


import javax.swing.JOptionPane;

class Animal {
    protected String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public void Especie() {
        JOptionPane.showMessageDialog(null, "Especie: " + especie);
    }
}

