
package Taller_5_Ejercicio_02;

import javax.swing.JOptionPane;

class Moto extends Vehiculo {
    private int cilindrada;
    
    public Moto (String tipo ,String marca , int cilindrada){
        super(tipo , marca);
        this.cilindrada = cilindrada;
        
    }
    
    public void mostrarInf(){
        JOptionPane.showMessageDialog(null,"Tipo: " + tipo + "\nMarca: " + marca + "\nCilindrada: "+ cilindrada + "cc");
    }
    
}
