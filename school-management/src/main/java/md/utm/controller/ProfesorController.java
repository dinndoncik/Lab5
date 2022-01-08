package md.utm.controller;

import md.utm.entity.Profesor;
import md.utm.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/profesor")
public class ProfesorController {

    @Autowired
    private ProfesorRepository profesorRepository;


    @GetMapping("/test")
    public String test(@RequestParam("nume") String nume, @RequestParam("email") String email) {
        return nume + "|||" + email;
    }

    @GetMapping
    public List<Profesor> ListaProfesori() {
        return profesorRepository.findAll();
    }


    @GetMapping("/varsta/{varsta}")
    public Profesor profesorByVarsta(@PathVariable("varsta") int varsta) {
        return profesorRepository.findByVarsta(varsta);

    }


    @PostMapping
    public void save(@RequestBody Profesor profesor) {
        profesorRepository.save(profesor);
    }


    @PutMapping("/{idnp}")
    public void update (@PathVariable("idnp") String idnp,@RequestBody Profesor profesor){
        profesorRepository.update(idnp,profesor);
    }
    @DeleteMapping("/{nume}")
    public void delete(@PathVariable("nume")String nume){
        profesorRepository.delete(nume);
    }


}
