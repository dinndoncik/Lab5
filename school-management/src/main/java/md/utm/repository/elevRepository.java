package md.utm.repository;

import md.utm.entity.Elev;
import md.utm.entity.ListaElevi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class elevRepository {

    @Autowired
    private JdbcTemplate jdbctemplate;


   /* List<Elev> findAll() {
        List<Elev> listaElevi = jdbctemplate.query("Select * from elev",
                (response, rowNumber) -> {
                    return new Elev(
                            response.getString("idnp"),
                            response.getString("nume"),
                            response.getString("prenume"),
                            response.getInt("varsta"),
                            response.getDouble("media"),
                            response.getInt("clasa"),
                            response.getInt("elev_liceu_id"));
                });
        return listaElevi;
    }

    */


    public Elev byClasa(Integer clasa) {
        Elev elev = jdbctemplate.queryForObject("Select * from elev WHERE clasa = ?",
                new Object[]{clasa}, (response, rowNumber) -> {
                    return new Elev(
                            response.getString("idnp"),
                            response.getString("nume"),
                            response.getString("prenume"),
                            response.getInt("varsta"),
                            response.getDouble("media"),
                            response.getInt("clasa"),
                            response.getInt("elev_liceu_id"));
                });
        return elev;
    }

    public Elev findByLId(int elev_liceu_id) {
        Elev elev = jdbctemplate.queryForObject("select * from elev where elev_liceu_id=? ",
                new Object[]{elev_liceu_id},
                (response, rowNumber) -> {
                    return new Elev(
                            response.getString("idnp"),
                            response.getString("nume"),
                            response.getString("prenume"),
                            response.getInt("varsta"),
                            response.getDouble("media"),
                            response.getInt("clasa"),
                            response.getInt("elev_liceu_id"));
                });
        return elev;
    }

    public Elev findByVarsta(int varsta) {
        Elev elev = jdbctemplate.queryForObject("select * from elev where varsta=? ",
                new Object[]{varsta},
                (response, rowNumber) -> {
                    return new Elev(
                            response.getString("idnp"),
                            response.getString("nume"),
                            response.getString("prenume"),
                            response.getInt("varsta"),
                            response.getDouble("media"),
                            response.getInt("clasa"),
                            response.getInt("elev_liceu_id"));
                });
        return elev;
    }

    public Elev findByIdnp(String idnp) {
        Elev elev = jdbctemplate.queryForObject("select * from elev where idnp   =?",
                new Object[]{idnp},
                (response, rowNumber) -> {
                    return new Elev(
                            response.getString("idnp"),
                            response.getString("nume"),
                            response.getString("prenume"),
                            response.getInt("varsta"),
                            response.getDouble("media"),
                            response.getInt("clasa"),
                            response.getInt("elev_liceu_id"));
                });
        return elev;
    }


    public List<ListaElevi> findAll() {
        List<ListaElevi> listaElevi = jdbctemplate.query("Select idnp, nume, prenume,varsta from elev",
                (response, rowNumber) -> {
                    return new ListaElevi(
                            response.getString("idnp"),
                            response.getString("nume"),
                            response.getString("prenume"),
                            response.getInt("varsta"));
                });
        return listaElevi;
    }

     public Elev byNume(String nume) {
         Elev elev = jdbctemplate.queryForObject("Select * from elev WHERE nume = ?",
                 new Object[]{nume},
                 (response, rowNumber) -> {
                     return new Elev(
                             response.getString("idnp"),
                             response.getString("nume"),
                             response.getString("prenume"),
                             response.getInt("varsta"),
                             response.getDouble("media"),
                             response.getInt("clasa"),
                             response.getInt("elev_liceu_id"));
                 });
         return elev;
     }

    //update-manipulari pe continut
    public void save(Elev elev) {
        jdbctemplate.update(
                "insert into elev (idnp, nume, prenume, varsta, media, clasa, elev_liceu_id)values (?, ?, ?, ?, ?, ?, ?);",
                elev.getIdnp(), elev.getNume(), elev.getPrenume(), elev.getVarsta(), elev.getMedia(), elev.getClasa(), elev.getElev_liceu_id());
    }


    public void update(String idnp, Elev elev) {
        jdbctemplate.update(
                "update elev set  nume=?, prenume=?,varsta=?, media=?,clasa=?, elev_liceu_id=? where idnp=?",
                elev.getNume(), elev.getPrenume(), elev.getVarsta(), elev.getMedia(), elev.getClasa(), elev.getElev_liceu_id(), idnp);
    }

    public void delete(String nume) {
        jdbctemplate.update("delete from elev where nume=?", nume);
    }

    public List<ListaElevi> findByLiceuNume( String nume) {
        List<ListaElevi> listaElevi = jdbctemplate.query("Select elev.idnp,elev.nume,elev.prenume, elev.varsta from elev " +
                        "inner join Liceu  on Liceu.id = elev_liceu_id " +
                        "where Liceu.nume = ?",
                new Object[]{nume},
                (response, rowNumber) -> {
                    return new ListaElevi(
                            response.getString("idnp"),
                            response.getString("nume"),
                            response.getString("prenume"),
                            response.getInt("varsta"));
                });
        return listaElevi;

    }


}
