package md.utm.repository;

import md.utm.entity.Profesor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.time.DayOfWeek;
import java.util.List;

@Repository
public class ProfesorRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;
//idnp,nume,prenume,varsta,disciplina,liceu id

    public Profesor byIdnp(String Idnp) {
        Profesor profesor = jdbcTemplate.queryForObject("Select * from profesor WHERE idnp = ?",
                new Object[]{Idnp}, (response, rowNumber) -> {
                    return new Profesor(    response.getString("idnp"),
                            response.getString("nume"),
                            response.getString("prenume"),
                            response.getInt("varsta"),
                            response.getString("disciplina"),
                            response.getInt("prof_liceu_id"));
                });
        return profesor;

    }


    public  Profesor findByVarsta(int varsta) {
        Profesor profesor = jdbcTemplate.queryForObject("select * from profesor where varsta=? ",
                new Object[]{varsta},
                (response, rowNumber) -> {
                    return new Profesor(
                            response.getString("idnp"),
                            response.getString("nume"),
                            response.getString("prenume"),
                            response.getInt("varsta"),
                            response.getString("disciplina"),
                            response.getInt("prof_liceu_id"));
                });
        return profesor;
    }


    public  List<Profesor> findAll() {
        List<Profesor> listaProfesori = jdbcTemplate.query("Select * from profesor",
                (response, rowNumber) -> {
                    return new Profesor(
                            response.getString("idnp"),
                            response.getString("nume"),
                            response.getString("prenume"),
                            response.getInt("varsta"),
                            response.getString("disciplina"),
                            response.getInt("prof_liceu_id"));
                });
        return listaProfesori;
    }

    public  void save(Profesor profesor){
        jdbcTemplate.update(
                "insert into profesor (idnp, nume, prenume, varsta, disciplina, prof_liceu_id)values (?, ?, ?, ?, ?, ?);",
                profesor.getIdnp(),profesor.getNume(),profesor.getPrenume(),profesor.getVarsta(),profesor.getDisciplina(),profesor.getProf_liceu_id());
    }


    public void update(String idnp, Profesor profesor){
        jdbcTemplate.update(
                "update profesor set  nume=?, prenume=?,varsta=?, disciplina=?, prof_liceu_id=? where idnp=?",
                profesor.getNume(),profesor.getPrenume(),profesor.getVarsta(),profesor.getDisciplina(),profesor.getProf_liceu_id(), idnp);
    }
    public  void delete(String nume){
        jdbcTemplate.update("delete from profesor where nume=?", nume);
    }






}

