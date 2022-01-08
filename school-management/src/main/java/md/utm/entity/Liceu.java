package md.utm.entity;

public class Liceu {
    private int id;
    private String nume;
    private String adresa;
    private String oras;


    public Liceu(int id, String nume, String adresa, String oras) {
        this.id = id;
        this.nume = nume;
        this.adresa = adresa;
        this.oras = oras;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public String getOras() {
        return oras;
    }

    public void setOras(String oras) {
        this.oras = oras;
    }

    @Override
    public String toString() {
        return "Liceu{" +
                "id=" + id +
                ", nume='" + nume + '\'' +
                ", adresa='" + adresa + '\'' +
                ", oras='" + oras + '\'' +
                '}';
    }
}
