package tn.esprit.gestionfoyerrihabachour.Service;


import tn.esprit.gestionfoyerrihabachour.entities.Cours;

import java.util.List;

public interface ICoursService {
    Cours addCours(Cours cours);
    Cours updateCours(Cours cours);
    List<Cours> findAll();
    Cours findById (long numCours);
    void delete (long numCours);
}
