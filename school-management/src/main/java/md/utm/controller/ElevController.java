package md.utm.controller;

import md.utm.entity.Elev;
import md.utm.entity.ListaElevi;
import md.utm.repository.elevRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/elev")
public class ElevController {

    @Autowired
    private elevRepository elevRepository;


    @GetMapping("/test")
    public String test(@RequestParam("nume") String nume, @RequestParam("email") String email) {
        return nume + "|||" + email;
    }


    @GetMapping("/liceu/{nume}")
    public List<ListaElevi> findByLiceuNume(@PathVariable("nume") String nume) {
        return elevRepository.findByLiceuNume(nume);
    }


    @GetMapping
    public List<ListaElevi> listaElevi() {
        return elevRepository.findAll();
    }

    @GetMapping("/clasa/{clasa}")
    public Elev byClasa(@PathVariable("clasa") Integer clasa) {
        return elevRepository.byClasa(clasa);
    }

    @GetMapping("/elev_liceu_id/{elev_liceu_id}")
    public Elev findByLId(@PathVariable("elev_liceu_id") int elev_liceu_id) {
        return elevRepository.findByLId(elev_liceu_id);
    }

    @GetMapping("/varsta/{varsta}")
    public Elev elevByVarsta(@PathVariable("varsta") int varsta) {
        return elevRepository.findByVarsta(varsta);

    }

    @GetMapping("/idnp/{idnp}")
    public Elev elevByIdnp(@PathVariable("idnp") String idnp) {
        return elevRepository.findByIdnp(idnp);

    }


    @GetMapping("/nume/{nume}")
    public Elev elevByNume(@PathVariable("nume") String nume) {
        return elevRepository.byNume(nume);
    }


    @PostMapping
    public void save(@RequestBody Elev elev) {
        elevRepository.save(elev);
    }


    @PutMapping("/{idnp}")
    public void update(@PathVariable("idnp") String idnp, @RequestBody Elev elev) {
        elevRepository.update(idnp, elev);
    }

    @DeleteMapping("/{nume}")
    public void delete(@PathVariable("nume") String nume) {
        elevRepository.delete(nume);
    }


}