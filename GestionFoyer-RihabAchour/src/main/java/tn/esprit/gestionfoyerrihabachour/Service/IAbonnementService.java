package tn.esprit.gestionfoyerrihabachour.Service;


import tn.esprit.gestionfoyerrihabachour.entities.Abonnement;
import tn.esprit.gestionfoyerrihabachour.entities.enums.TypeAbonnement;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

public interface IAbonnementService {
    Abonnement addAbonnement(Abonnement abonnement);
    Abonnement updateAbonnement(Abonnement abonnement);
    List<Abonnement> findAll();
    Abonnement findById (long numAbonnement);
    void delete (long numAbonnement);
    //mazelt makhdmtch
    Set<Abonnement> getAbonnementByType(TypeAbonnement type);
    //mazelt makhdmtch
    List<Abonnement> retrieveAbonnementByDates(LocalDate startDate, LocalDate endDate);
    void retrieveSubscriptions();
    public void showMonthlyRecurringRevenue();
}
