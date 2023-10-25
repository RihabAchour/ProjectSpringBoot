package tn.esprit.gestionfoyerrihabachour.Service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.gestionfoyerrihabachour.Repositories.CoursRepo;
import tn.esprit.gestionfoyerrihabachour.entities.Cours;

import java.util.List;
@RequiredArgsConstructor
@Service
public class ICoursServiceImp implements ICoursService{

     private final CoursRepo coursRepo;
    @Override
    public Cours addCours(Cours cours) {
        return coursRepo.save(cours);
    }

    @Override
    public Cours updateCours(Cours cours) {
        return coursRepo.save(cours);
    }

    @Override
    public List<Cours> findAll() {
        return (List<Cours>) coursRepo.findAll();
    }

    @Override
    public Cours findById(long numCours) {
        return coursRepo.findById(numCours).orElse(null);
    }

    @Override
    public void delete(long numCours) {
 coursRepo.deleteById(numCours);

    }
}
