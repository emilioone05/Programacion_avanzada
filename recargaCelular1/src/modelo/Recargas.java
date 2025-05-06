package modelo;
public class Recargas {
    public int idReca;
    public int valor;
    public int saldo;
    public int megas;
    public int id_cel;

    public Recargas() {
    }

    public Recargas(int idReca, int valor, int saldo, int megas, int id_cel) {
        this.idReca = idReca;
        this.valor = valor;
        this.saldo = saldo;
        this.megas = megas;
        this.id_cel = id_cel;
    }

    public int getIdReca() {
        return idReca;
    }

    public void setIdReca(int idReca) {
        this.idReca = idReca;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getMegas() {
        return megas;
    }

    public void setMegas(int megas) {
        this.megas = megas;
    }

    public int getId_cel() {
        return id_cel;
    }

    public void setId_cel(int id_cel) {
        this.id_cel = id_cel;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Recargas{");
        sb.append("idReca=").append(idReca);
        sb.append(", valor=").append(valor);
        sb.append(", saldo=").append(saldo);
        sb.append(", megas=").append(megas);
        sb.append(", id_cel=").append(id_cel);
        sb.append('}');
        return sb.toString();
    }

   
}
