package md.utm.entity;

public class Elev {
    private String idnp;
    private String nume;
    private String prenume;
    private int varsta;
    private double media;
    private int clasa;
    private int elev_liceu_id;

    public Elev(String idnp, String nume, String prenume, int varsta, double media, int clasa, int elev_liceu_id) {
        this.idnp = idnp;
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.media = media;
        this.clasa = clasa;
        this.elev_liceu_id = elev_liceu_id;
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

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public int getClasa() {
        return clasa;
    }

    public void setClasa(int clasa) {
        this.clasa = clasa;
    }

    public int getElev_liceu_id() {
        return elev_liceu_id;
    }

    public void setElev_liceu_id(int elev_liceu_id) {
        this.elev_liceu_id = elev_liceu_id;
    }

    @Override
    public String toString() {
        return "Elev{" +
                "idnp='" + idnp + '\'' +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", media=" + media +
                ", clasa=" + clasa +
                ", institutionID=" + elev_liceu_id +
                '}';
    }
}
