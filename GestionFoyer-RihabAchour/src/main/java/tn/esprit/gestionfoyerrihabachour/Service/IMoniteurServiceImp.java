package tn.esprit.gestionfoyerrihabachour.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionfoyerrihabachour.Repositories.CoursRepo;
import tn.esprit.gestionfoyerrihabachour.Repositories.MoniteurRepo;
import tn.esprit.gestionfoyerrihabachour.entities.Cours;
import tn.esprit.gestionfoyerrihabachour.entities.Moniteur;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class IMoniteurServiceImp implements IMoniteurService{

    MoniteurRepo moniteurRepo;
    CoursRepo coursRepo;
    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepo.save(moniteur);
       }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepo.save(moniteur);
    }

    @Override
    public List<Moniteur> findAll() {
        return (List<Moniteur>) moniteurRepo.findAll();
    }

    @Override
    public Moniteur findById(long numMoniteur) {
        return moniteurRepo.findById(numMoniteur).orElse(null);
    }

    @Override
    public void delete(long numMoniteur) {
  moniteurRepo.deleteById(numMoniteur);
    }

    @Override
    public Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, long numCours) {
        Cours cours= coursRepo.findById(numCours).orElse(null);
        //namel intialisation lil set w baed n3abi bil cours
        //les 3 ligne suivants sont pour l'affectation de cours lil moniteur
        Set<Cours> coursSet=new HashSet<>();// HashSet pour stocker les cours associés au moniteur. A Setest utilisé pour garantir que chaque cours est unique.
        coursSet.add(cours);
        moniteur.setCours(coursSet);
        //ajout de moniteur donc il va etre managed-entity
        return moniteurRepo.save(moniteur);


    }
}
