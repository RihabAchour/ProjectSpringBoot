package tn.esprit.gestionfoyerrihabachour.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionfoyerrihabachour.Service.ICoursService;
import tn.esprit.gestionfoyerrihabachour.entities.Cours;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("cours")
public class CoursController {
    private final ICoursService coursService;

    @PostMapping
    public Cours AddInscription(@RequestBody Cours cours) {
        coursService.addCours(cours);
        return cours;
    }
    @PutMapping
    public Cours updateInscription(@RequestBody  Cours cours){
        return coursService.updateCours(cours)
;    }
    @DeleteMapping("/{numCours}")
    public void delete(@PathVariable long  numCours)    {
        coursService.delete(numCours);
    }
    @GetMapping("/{numCours}")
    public Cours FindById(@PathVariable long numCours){
        return coursService. findById(numCours);
    }
    @GetMapping
    public List<Cours> findAll(){
        return coursService.findAll() ;
    }
}
