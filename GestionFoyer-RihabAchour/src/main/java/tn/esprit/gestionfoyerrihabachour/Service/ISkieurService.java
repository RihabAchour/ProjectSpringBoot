package tn.esprit.gestionfoyerrihabachour.Service;

import tn.esprit.gestionfoyerrihabachour.entities.Inscription;
import tn.esprit.gestionfoyerrihabachour.entities.Skieur;

import java.util.List;

public interface ISkieurService {
    Skieur addSkieur(Skieur skieur);
    Skieur updateSkieur(Skieur skieur);
    List<Skieur> findAll();
    Skieur findById (long numSkieur);
    void delete (long numSkieur);

}
