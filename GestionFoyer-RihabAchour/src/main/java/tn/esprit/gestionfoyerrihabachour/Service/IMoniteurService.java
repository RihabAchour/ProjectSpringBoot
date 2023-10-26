package tn.esprit.gestionfoyerrihabachour.Service;


import tn.esprit.gestionfoyerrihabachour.entities.Moniteur;

import java.util.List;

public interface IMoniteurService {
    Moniteur addMoniteur(Moniteur moniteur);
    Moniteur updateMoniteur(Moniteur moniteur);
    List<Moniteur> findAll();
    Moniteur findById (long numMoniteur);
    void delete (long numMoniteur);

    Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, long numCours);
}
