
package Parcial;

public class Candidato {

    String nombre ;
    String direccion ;
    String telefono;
    String email ;
    
    
    public Candidato(String nombre ,String direccion, String telefono,String email){
        
        this.nombre = nombre ;
        this.direccion = direccion;
        this.telefono = telefono ;
        this.email = email;
        
    }
    
    public String getNombre(){
        return nombre ;
    }
    
    
    public String getInformacionContacto (){
        return "nombre :" + nombre + "\ndireccion :" + direccion + "\ntelefono :" + telefono + "email :" + email;
    }

    
}
