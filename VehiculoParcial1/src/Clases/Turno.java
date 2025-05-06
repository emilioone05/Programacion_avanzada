
package Clases;


public class Turno {
    
    int Idturn;
    int Anden;
    int Dia;
    int Hora;

    public Turno() {
    }

    public Turno(int Idturn, int Anden, int Dia, int Hora) {
        this.Idturn = Idturn;
        this.Anden = Anden;
        this.Dia = Dia;
        this.Hora = Hora;
    }

    public int getIdturn() {
        return Idturn;
    }

    public void setIdturn(int Idturn) {
        this.Idturn = Idturn;
    }

    public int getAnden() {
        return Anden;
    }

    public void setAnden(int Anden) {
        this.Anden = Anden;
    }

    public int getDia() {
        return Dia;
    }

    public void setDia(int Dia) {
        this.Dia = Dia;
    }

    public int getHora() {
        return Hora;
    }

    public void setHora(int Hora) {
        this.Hora = Hora;
    }
    
    
    
}
