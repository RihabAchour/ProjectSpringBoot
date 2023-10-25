package tn.esprit.gestionfoyerrihabachour.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionfoyerrihabachour.Service.IInscriptionService;
import tn.esprit.gestionfoyerrihabachour.entities.Inscription;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class InscriptionController {
    private final IInscriptionService Inscriptionservice;


    @RequestMapping(value = "/AddInscription", method = RequestMethod.POST)
    public String addInscription(@ModelAttribute("inscription") Inscription inscription) {
        Inscriptionservice.addInscription(inscription);
        return "redirect:/"; //redirigé vers la page d'accueil

    }
    @GetMapping("delete/{numInscription}")
    public void delete(@PathVariable("numInscription")long numInscription)    {
        Inscriptionservice.delete(numInscription);
    }
    @GetMapping("/findById/{numInscription}")
    public Inscription FindById(@PathVariable("numInscription") long numInscription){

        return Inscriptionservice. findById(numInscription);
    }
    @GetMapping("/findAllInscription")
    public List<Inscription> findAll(){
        return Inscriptionservice.findAll() ;

    }
}
