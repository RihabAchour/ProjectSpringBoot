package tn.esprit.gestionfoyerrihabachour.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionfoyerrihabachour.Repositories.AbonnementRepo;
import tn.esprit.gestionfoyerrihabachour.entities.Abonnement;

import java.util.List;
@Service
public class IAbonnementServiceImp implements IAbonnementService {
    @Autowired
    AbonnementRepo abonnementRepo;
    @Override
    public Abonnement addAbonnement(Abonnement abonnement) {
        return abonnementRepo.save(abonnement);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement abonnement) {
        return abonnementRepo.save(abonnement);
    }

    @Override
    public List<Abonnement> findAll() {
        return (List<Abonnement>) abonnementRepo.findAll();
    }

    @Override
    public Abonnement findById(long numAbonnement) {
        return abonnementRepo.findById(numAbonnement).orElse(null);
    }

    @Override
    public void delete(long numAbonnement) {
     abonnementRepo.deleteById(numAbonnement);
    }
}
