package tn.esprit.gestionfoyerrihabachour.Repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.gestionfoyerrihabachour.entities.Skieur;
import tn.esprit.gestionfoyerrihabachour.entities.enums.Couleur;
import tn.esprit.gestionfoyerrihabachour.entities.enums.Support;
import tn.esprit.gestionfoyerrihabachour.entities.enums.TypeAbonnement;
import tn.esprit.gestionfoyerrihabachour.entities.enums.TypeCours;

import java.util.List;

public interface SkieurRepo extends CrudRepository<Skieur,Long> {
    List <Skieur> findByAbonnement_TypeAbonnement(TypeAbonnement abonnement_typeAbonnement);
    List <Skieur> findByAbonnement_TypeAbonnementAndPisteSetCouleurAndInscriptionSetCoursTypeCoursAndInscriptionSetCoursSupport(TypeAbonnement abonnement_typeAbonnement, Couleur pisteSet_couleur, TypeCours inscriptionSet_cours_typeCours, Support inscriptionSet_cours_support);
}
