package md.utm.entity;

public class ListaElevi{
    private String idnp;
    private String nume;
    private String prenume;
    private int varsta;


    public ListaElevi(String idnp, String nume, String prenume, int varsta) {
        this.idnp = idnp;
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;

    }

    public String getIdnp() {
        return idnp;
    }

    public void setIdnp(String idnp) {
        this.idnp = idnp;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public int getVarsta() {
        return varsta;
    }

    public void setVarsta(int varsta) {
        this.varsta = varsta;
    }


    @Override
    public String toString() {
        return "Elev{" +
                "idnp='" + idnp + '\'' +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                '}';
    }
}
