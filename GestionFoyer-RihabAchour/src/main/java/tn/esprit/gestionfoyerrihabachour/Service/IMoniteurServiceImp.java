package tn.esprit.gestionfoyerrihabachour.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionfoyerrihabachour.Repositories.MoniteurRepo;
import tn.esprit.gestionfoyerrihabachour.entities.Moniteur;

import java.util.List;

@Service
public class IMoniteurServiceImp implements IMoniteurService{
    @Autowired
    MoniteurRepo moniteurRepo;
    @Override
    public Moniteur addMoniteur(Moniteur moniteur) {
        return moniteurRepo.save(moniteur);
       }

    @Override
    public Moniteur updateMoniteur(Moniteur moniteur) {
        return moniteurRepo.save(moniteur);
    }

    @Override
    public List<Moniteur> findAll() {
        return (List<Moniteur>) moniteurRepo.findAll();
    }

    @Override
    public Moniteur findById(long numMoniteur) {
        return moniteurRepo.findById(numMoniteur).orElse(null);
    }

    @Override
    public void delete(long numMoniteur) {
  moniteurRepo.deleteById(numMoniteur);
    }
}
