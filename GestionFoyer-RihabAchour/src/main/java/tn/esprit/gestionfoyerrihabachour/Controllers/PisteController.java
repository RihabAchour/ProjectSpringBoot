package tn.esprit.gestionfoyerrihabachour.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionfoyerrihabachour.Service.IMoniteurService;
import tn.esprit.gestionfoyerrihabachour.Service.IPisteService;
import tn.esprit.gestionfoyerrihabachour.entities.Piste;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("piste")
public class PisteController {
    private final IPisteService iPisteService;


    @PostMapping
    public Piste AddPiste(@RequestBody Piste piste) {
        iPisteService.addPiste(piste);
        return piste;
    }
    @PutMapping
    public Piste updatePiste(@RequestBody  Piste piste){
        return iPisteService.updatePiste(piste);    }
    @DeleteMapping("/{numPiste}")
    public void delete(@RequestBody long  numPiste)    {
        iPisteService.delete(numPiste);
    }
    @GetMapping("/{numPiste}")
    public Piste FindById(@PathVariable long numPiste){
        return iPisteService. findById(numPiste);
    }
    @GetMapping
    public List<Piste> findAll(){
        return iPisteService.findAll() ;
    }

}
