package md.utm.controller;

import md.utm.entity.Liceu;
import md.utm.repository.LiceuRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/liceu")
public class LiceuController {

    @Autowired
    private LiceuRepository liceuRepository;

    @GetMapping("/test")
    public String test(@RequestParam("nume") String nume, @RequestParam("email") String email) {
        return nume + "|||" + email;
    }
    @GetMapping
    public List<Liceu> listaLiceu() {
        return liceuRepository.findAll();
    }


   @GetMapping("/id/{id}")
    public Liceu byId(@PathVariable("id") Integer id) {
        return liceuRepository.byId(id);
    }
    @PostMapping
    public void save(@RequestBody Liceu liceu){
        liceuRepository.save(liceu);
    }

    @PutMapping("/{id}")
    public void update (@PathVariable("id") Integer id,@RequestBody Liceu liceu){
        liceuRepository.update(id, liceu);
    }
    @DeleteMapping("/{nume}")
    public void delete(@PathVariable("nume")String nume){
        liceuRepository.delete(nume);
    }




}



