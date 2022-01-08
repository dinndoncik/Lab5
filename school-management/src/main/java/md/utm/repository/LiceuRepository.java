package md.utm.repository;

import md.utm.entity.Liceu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class LiceuRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public List<Liceu> findAll() {
        List<Liceu> listaLiceu = jdbcTemplate.query("Select id,nume,adresa,oras from liceu",
                (rs, rowNum) -> {
                    return new Liceu(
                            rs.getInt("id"),
                            rs.getString("nume"),
                            rs.getString("adresa"),
                            rs.getString("oras"));


                });
        return listaLiceu;
    }

    public Liceu byId(Integer id){
        Liceu liceu = jdbcTemplate.queryForObject("Select *from liceu where id=?",
                new Object[]{id},(rs, rowNum) -> {
                    return new Liceu(rs.getInt( "id"),
                            rs.getString("nume"),
                            rs.getString("adresa"),
                            rs.getString("oras")) ;
                });
        return liceu;
    }
    public void save(Liceu liceu){
        jdbcTemplate.update(
                "insert into liceu(id, nume, adresa, oras)values (?, ?, ?, ?)",
                liceu.getId(), liceu.getNume(), liceu.getAdresa(), liceu.getOras());
    }
    public  void update(int id, Liceu liceu){
        jdbcTemplate.update("update liceu set  nume=?, adresa=?,oras=? where id=?",
                liceu.getNume(), liceu.getAdresa(), liceu.getOras(), id);
    }
    public  void delete(String nume){
        jdbcTemplate.update("delete from liceu where nume=?", nume);
    }





}

