
package Taller_08_Ejercicio_02;

import javax.swing.JOptionPane;


class Pez extends Animal {
    private String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) {
        super(especie); 
        this.tipoDeAgua = tipoDeAgua;
    }

    @Override
    public void Especie() {
        super.Especie(); 
        JOptionPane.showMessageDialog(null, "Tipo de Agua: " + tipoDeAgua);
    }
}
