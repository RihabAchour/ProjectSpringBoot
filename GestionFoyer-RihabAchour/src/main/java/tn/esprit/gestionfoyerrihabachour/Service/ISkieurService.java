package tn.esprit.gestionfoyerrihabachour.Service;

import tn.esprit.gestionfoyerrihabachour.entities.Skieur;
import tn.esprit.gestionfoyerrihabachour.entities.enums.TypeAbonnement;

import java.util.List;

public interface ISkieurService {
    Skieur addSkieur(Skieur skieur);
    Skieur updateSkieur(Skieur skieur);
    List<Skieur> findAll();
    Skieur findById (long numSkieur);
    void delete (long numSkieur);
    Skieur assignSkierToPiste(long numSkieur,long numPiste);
    Skieur addSkierAndAssignToCourse(Skieur skieur, long numCours);
    List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);
}
