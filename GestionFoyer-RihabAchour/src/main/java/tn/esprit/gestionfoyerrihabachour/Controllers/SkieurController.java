package tn.esprit.gestionfoyerrihabachour.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionfoyerrihabachour.Service.ISkieurService;
import tn.esprit.gestionfoyerrihabachour.entities.Inscription;
import tn.esprit.gestionfoyerrihabachour.entities.Skieur;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/skieur")
public class SkieurController {

    private final ISkieurService skieurService;

    @PostMapping
    public Skieur AddSkieur(@RequestBody Skieur skieur) {
        skieurService.addSkieur(skieur);
        return skieur;
    }
    @PutMapping
    public Skieur updateSkieur (@RequestBody  Skieur skieur){
        return skieurService.updateSkieur(skieur);
    }
    @DeleteMapping("/{numSkieur}")
    public void delete(@RequestBody long  numSkieur)    {
        skieurService.delete(numSkieur);
    }
    @GetMapping("/{numSkieur}")
    public Skieur FindById(@PathVariable long numSkieur){
        return skieurService. findById(numSkieur);
    }
    @GetMapping
    public List<Skieur> findAll(){
        return skieurService.findAll() ;
    }


}