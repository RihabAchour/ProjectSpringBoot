package tn.esprit.gestionfoyerrihabachour.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionfoyerrihabachour.Service.ISkieurService;
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
    public void delete(@PathVariable long numSkieur) {
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
    @PutMapping ("/{numSkieur}/{numPiste}")
   public  Skieur assignSkierToPiste(@PathVariable long numSkieur, @PathVariable long numPiste){
return skieurService.assignSkierToPiste(numSkieur,numPiste);
    }
    @PostMapping("/{numCours}")
    public Skieur addSkierAndAssignToCourse(Skieur skieur, Long numCours){
        return skieurService.addSkierAndAssignToCourse(skieur,numCours);
    }

}