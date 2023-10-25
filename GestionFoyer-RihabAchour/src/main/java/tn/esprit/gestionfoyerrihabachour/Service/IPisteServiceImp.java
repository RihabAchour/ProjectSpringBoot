package tn.esprit.gestionfoyerrihabachour.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionfoyerrihabachour.Repositories.PisteRepo;
import tn.esprit.gestionfoyerrihabachour.entities.Piste;

import java.util.List;
@Service
public class IPisteServiceImp implements IPisteService{
    @Autowired
    PisteRepo pisteRepo;
    @Override
    public Piste addPiste(Piste piste) {
        return pisteRepo.save(piste);
    }

    @Override
    public Piste updatePiste(Piste piste) {
        return pisteRepo.save(piste);
    }

    @Override
    public List<Piste> findAll() {
        return (List<Piste>) pisteRepo.findAll();
    }

    @Override
    public Piste findById(long numPiste) {
        return pisteRepo.findById(numPiste).orElse(null);
    //return pisteRepo.findById(numPiste)
           // .orElseThrow(()->new IllegalArgumentException("no piste found with this id"))
    }

    @Override
    public void delete(long numPiste) {
    pisteRepo.deleteById(numPiste );
    }
}
