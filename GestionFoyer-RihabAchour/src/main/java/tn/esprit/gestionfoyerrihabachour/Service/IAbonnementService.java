package tn.esprit.gestionfoyerrihabachour.Service;


import tn.esprit.gestionfoyerrihabachour.entities.Abonnement;

import java.util.List;

public interface IAbonnementService {
    Abonnement addAbonnement(Abonnement abonnement);
    Abonnement updateAbonnement(Abonnement abonnement);
    List<Abonnement> findAll();
    Abonnement findById (long numAbonnement);
    void delete (long numAbonnement);
}
