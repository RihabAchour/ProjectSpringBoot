package tn.esprit.gestionfoyerrihabachour.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionfoyerrihabachour.Service.IMoniteurService;
import tn.esprit.gestionfoyerrihabachour.entities.Moniteur;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("moniteur")
public class MoniteurController {


    private final IMoniteurService iMoniteurService;

    @PostMapping
    public Moniteur AddMoniteur(@RequestBody Moniteur moniteur) {
        iMoniteurService.addMoniteur(moniteur);
        return moniteur;
    }
    @PutMapping
    public Moniteur updateMoniteur(@RequestBody  Moniteur moniteur){
        return iMoniteurService.updateMoniteur(moniteur);  }
    @DeleteMapping("/{numMoniteur}")
    public void delete(@RequestBody long  numMoniteur)    {
        iMoniteurService.delete(numMoniteur);
    }
    @GetMapping("/{numMoniteur}")
    public Moniteur FindById(@PathVariable long numMoniteur){
        return iMoniteurService. findById(numMoniteur);
    }
    @GetMapping
    public List<Moniteur> findAll(){
        return iMoniteurService.findAll() ;
    }


}
