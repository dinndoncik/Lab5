package md.utm.entity;

public class Profesor {
    private String idnp;
    private String nume;
    private String prenume;
    private int    varsta;
    private String disciplina;
    private int    prof_liceu_id;

    public Profesor(String idnp, String nume, String prenume, int varsta, String disciplina, int prof_liceu_id) {
        this.idnp = idnp;
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.disciplina = disciplina;
        this.prof_liceu_id = prof_liceu_id;
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

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public int getProf_liceu_id() {
        return prof_liceu_id;
    }

    public void setProf_liceu_id(int prof_liceu_id) {
        this.prof_liceu_id = prof_liceu_id;
    }

    @Override
    public String toString() {
        return "Profesor{" +
                "idnp='" + idnp + '\'' +
                ", nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", varsta=" + varsta +
                ", disciplina='" + disciplina + '\'' +
                ", prof_liceu_id=" + prof_liceu_id +
                '}';
    }
}
