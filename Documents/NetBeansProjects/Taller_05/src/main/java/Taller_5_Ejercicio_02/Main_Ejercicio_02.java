
package Taller_5_Ejercicio_02;

public class Main_Ejercicio_02 {
    public static void main(String [] ss){
        Vehiculo vehiculo = new Vehiculo ("Automovil","4x4");
        Moto moto = new Moto ("Motocicleta ","Yamaha xtz 150",149);
        
        
       vehiculo.mostrarInformacion();
       moto.mostrarInformacion();
       
          // Intento de acceso directo a propiedades protegidas (provocara error de compilacion)
        // vehiculo.tipo = "Camion"; // Error: tipo es protected y no accesible fuera de la jerarquia de clases
    }
}
