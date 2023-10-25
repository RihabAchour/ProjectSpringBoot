package tn.esprit.gestionfoyerrihabachour.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionfoyerrihabachour.Repositories.SkieurRepo;
import tn.esprit.gestionfoyerrihabachour.entities.Skieur;

import java.util.List;
@RequiredArgsConstructor
@Service
public class ISkieurServiceImp implements ISkieurService {

    private final  SkieurRepo skieurRepo;
    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepo.save(skieur);
    }

    @Override
    public Skieur updateSkieur(Skieur skieur) {
        return skieurRepo.save(skieur);
    }

    @Override
    public List<Skieur> findAll() {
        return (List<Skieur>)skieurRepo.findAll();
    }

    @Override
    public Skieur findById(long numSkieur) {
        return skieurRepo.findById(numSkieur).orElse(null);
    }

    @Override
    public void delete(long numSkieur) {
  skieurRepo.deleteById(numSkieur);
    }
}
