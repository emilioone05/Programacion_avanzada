
package Clases;

public class Propietario {
    
    int Idprop; 
    String Cedula;
    String Apellido; 
    String Nombre;  

    public Propietario() {
    }

    public Propietario(int Idprop, String Cedula, String Apellido, String Nombre) {
        this.Idprop = Idprop;
        this.Cedula = Cedula;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
    }

    public int getIdprop() {
        return Idprop;
    }

    public void setIdprop(int Idprop) {
        this.Idprop = Idprop;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    
    
}
