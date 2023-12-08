package tn.esprit.gestionfoyerrihabachour.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionfoyerrihabachour.Service.IAbonnementService;
import tn.esprit.gestionfoyerrihabachour.entities.Abonnement;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("abonnement")
public class AbonnementController {
    private final IAbonnementService iAbonnementService;
    @PostMapping
    public Abonnement AddAbonnement(@RequestBody Abonnement abonnement) {
        iAbonnementService.addAbonnement(abonnement);
        return abonnement;
    }
    @PutMapping
    public Abonnement updateAbonnement (@RequestBody  Abonnement abonnement){
        return iAbonnementService.updateAbonnement(abonnement);    }
    @DeleteMapping("/{numAbonnement}")
    public void delete(@PathVariable  long  numCours)    {
        iAbonnementService.delete(numCours);
    }
    @GetMapping("/{numAbonnement}")
    public Abonnement FindById(@PathVariable long numAbonnement){
        return iAbonnementService. findById(numAbonnement);
    }
    @GetMapping
    public List<Abonnement> findAll(){
        return iAbonnementService.findAll() ;
    }

}
