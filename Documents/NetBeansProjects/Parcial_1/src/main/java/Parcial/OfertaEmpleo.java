
package Parcial;
//
public class OfertaEmpleo {
    String descripcion ;
    String ubicacion;
    int salario ;
    Empresa empresa;
   
    
    public OfertaEmpleo (String descripcion , String ubicacion ,int salario , Empresa empresa){
        
        this.descripcion = descripcion;
        this.empresa = empresa ;
        this.ubicacion = ubicacion ;
        this.salario = salario ;
    }
     
                 public String getDetalles () {
            return "Descripcion :" + descripcion + "\nUbicacion :" + ubicacion + "\nSalario :" + salario + "\nEmpresa :" + empresa.getNombre();
            
        }
}