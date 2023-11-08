package tn.esprit.gestionfoyerrihabachour.Repositories;

import org.springframework.data.repository.CrudRepository;
import tn.esprit.gestionfoyerrihabachour.entities.Abonnement;
import tn.esprit.gestionfoyerrihabachour.entities.enums.TypeAbonnement;

import java.util.Date;
import java.util.List;

public interface AbonnementRepo extends CrudRepository<Abonnement,Long> {
    //fonction query bil keyword
    List <Abonnement>  findBytypeAbonnement(TypeAbonnement typeAbonnement);
    List <Abonnement> findByTypeAbonnementAndDatedebutBetween(TypeAbonnement typeAbonnement, Date datedebut, Date datedebut2);
}
