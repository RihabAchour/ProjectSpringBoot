package tn.esprit.gestionfoyerrihabachour.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionfoyerrihabachour.Service.IInscriptionService;
import tn.esprit.gestionfoyerrihabachour.entities.Inscription;


import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("inscription")
public class InscriptionController {
    private final IInscriptionService Inscriptionservice;
   /* @PostMapping("/{numSkieur}")
    public ResponseEntity<Inscription> addInscriptionToSkieur(@PathVariable long numSkieur, @RequestBody Inscription inscription) {
        Skieur skieur = iSkieurService.findById(numSkieur);
        inscription.setSkieur(skieur);
        Inscription Iinscription = Inscriptionservice.addInscription(inscription);
        return new ResponseEntity<>(Iinscription, HttpStatus.CREATED);
    }*/
   @PostMapping("/{numSkieur}")
   public Inscription addInscriptionAndAssignToSkier( @RequestBody Inscription inscription,@PathVariable long numSkieur){
       return Inscriptionservice.addInscriptionAndAssignToSkier(inscription,numSkieur);
   }
    @PostMapping("/{numInscription}/{numCours}")
   public Inscription assignInscriptionToCourse(@PathVariable long numInscription, @PathVariable long numCours){
       return Inscriptionservice.assignInscriptionToCourse(numInscription,numCours);
   }
    @PutMapping
    public Inscription updateInscription (@RequestBody  Inscription inscription){
        return Inscriptionservice.updateInscription(inscription);
    }
    @DeleteMapping("/{numInscription}")
    public void delete(@PathVariable long  numInscription)    {
        Inscriptionservice.delete(numInscription);
    }
    @GetMapping("/{numInscription}")
    public Inscription FindById(@PathVariable long numInscription){
        return Inscriptionservice. findById(numInscription);
    }
    @GetMapping
    public List<Inscription> findAll(){
        return Inscriptionservice.findAll() ;
    }
}
