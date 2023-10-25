package tn.esprit.gestionfoyerrihabachour.Controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.gestionfoyerrihabachour.Service.ICoursService;
import tn.esprit.gestionfoyerrihabachour.entities.Cours;

import java.util.List;
@RestController
@RequiredArgsConstructor
public class CoursController {
    private final ICoursService coursService;

    @RequestMapping(value = "/AddCours", method = RequestMethod.POST)
    public String addCours(@ModelAttribute("cours") Cours cours) {
        coursService.addCours(cours);
        return "redirect:/";
    }
    @GetMapping("delete/{numCours}")
    public void delete(@PathVariable("numcours")long numCours)    {
        coursService.delete(numCours);
    }
    @GetMapping("/findById/{numCours}")
    public Cours FindById(@PathVariable("numcours") long numCours){

        return coursService. findById(numCours);
    }
    @GetMapping("/findAllCours")
    public List<Cours> findAll(){
        return coursService.findAll() ;

    }
}
