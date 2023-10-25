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
    @PostMapping
    public Inscription AddInscription(@RequestBody Inscription inscription) {
        Inscriptionservice.addInscription(inscription);
        return inscription;
    }
    @PutMapping
    public Inscription updateInscription (@RequestBody  Inscription inscription){
        return Inscriptionservice.updateInscription(inscription);
    }
    @DeleteMapping("/{numInscription}")
    public void delete(@RequestBody long  numInscription)    {
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
