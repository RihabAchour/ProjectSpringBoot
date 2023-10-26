package tn.esprit.gestionfoyerrihabachour.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionfoyerrihabachour.Repositories.InscriptionRepo;
import tn.esprit.gestionfoyerrihabachour.Repositories.SkieurRepo;
import tn.esprit.gestionfoyerrihabachour.entities.Inscription;

import java.util.List;
@Service
@RequiredArgsConstructor
public class IInscriptionServiceImp implements IInscriptionService{

     private final InscriptionRepo inscriptionRepo;
 private final SkieurRepo skieurRepo;
    @Override
    public Inscription addInscription(Inscription inscription) {
        return inscriptionRepo.save(inscription);
    }

    @Override
    public Inscription updateInscription(Inscription inscription) {
        return inscriptionRepo.save(inscription);
    }

    @Override
    public List<Inscription> findAll() {
        return (List<Inscription>) inscriptionRepo.findAll();
    }

    @Override
    public Inscription findById(long numInscription) {
        return inscriptionRepo.findById(numInscription).orElse(null);
    }

    @Override
    public void delete(long numInscription) {
  inscriptionRepo.deleteById(numInscription);
    }
}
