package tn.esprit.gestionfoyerrihabachour.Service;


import tn.esprit.gestionfoyerrihabachour.entities.Inscription;

import java.util.List;

public interface IInscriptionService {
    Inscription addInscription(Inscription inscription);
    Inscription updateInscription(Inscription inscription);
    List<Inscription> findAll();
    Inscription findById (long numInscription);
    void delete (long numInscription);
    Inscription addInscriptionAndAssignToSkier(Inscription inscription, long numSkieur);
    Inscription assignInscriptionToCourse(long numInscription, long numCours);
//mazlt makhdmtch
Inscription addRegistrationAndAssignToSkierAndCourse(Inscription inscription, Long numSkieur, Long numCours);

}
