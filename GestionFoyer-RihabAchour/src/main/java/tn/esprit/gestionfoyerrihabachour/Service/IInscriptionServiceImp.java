package tn.esprit.gestionfoyerrihabachour.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.gestionfoyerrihabachour.Repositories.CoursRepo;
import tn.esprit.gestionfoyerrihabachour.Repositories.InscriptionRepo;
import tn.esprit.gestionfoyerrihabachour.Repositories.SkieurRepo;
import tn.esprit.gestionfoyerrihabachour.entities.Cours;
import tn.esprit.gestionfoyerrihabachour.entities.Inscription;
import tn.esprit.gestionfoyerrihabachour.entities.Skieur;

import java.util.List;
@Service
@RequiredArgsConstructor
public class IInscriptionServiceImp implements IInscriptionService{

     private final InscriptionRepo inscriptionRepo;
 private final SkieurRepo skieurRepo;
 private final CoursRepo coursRepo;
    @Override
    public Inscription addInscription(Inscription inscription) {
        return inscriptionRepo.save(inscription);
    }

    @Override
    public Inscription updateInscription(Inscription inscription) {
        return inscriptionRepo.save(inscription);
    }

    @Override
    public List<Inscription> findAll() {
        return (List<Inscription>) inscriptionRepo.findAll();
    }

    @Override
    public Inscription findById(long numInscription) {
        return inscriptionRepo.findById(numInscription).orElse(null);
    }

    @Override
    public void delete(long numInscription) {
  inscriptionRepo.deleteById(numInscription);
    }
    @Override
    public Inscription addInscriptionAndAssignToSkier(Inscription inscription, long numSkieur) {
        Skieur skieur=skieurRepo.findById(numSkieur).orElse(null);
        inscription.setSkieur(skieur);
        return inscriptionRepo.save(inscription);
    }

    @Override
    public Inscription assignInscriptionToCourse(long numInscription, long numCours) {
        Cours cours=coursRepo.findById(numCours).orElse(null);
       Inscription inscription=inscriptionRepo.findById(numInscription).orElse(null);
       inscription.setCours(cours);

       return inscriptionRepo.save(inscription);

    }

    @Override
    public Inscription addRegistrationAndAssignToSkierAndCourse(Inscription inscription, Long numSkieur, Long numCours) {
        return null;
    }

}
