package tn.esprit.gestionfoyerrihabachour.Service;

import lombok.Builder;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Assert;
import tn.esprit.gestionfoyerrihabachour.Repositories.CoursRepo;
import tn.esprit.gestionfoyerrihabachour.Repositories.InscriptionRepo;
import tn.esprit.gestionfoyerrihabachour.Repositories.PisteRepo;
import tn.esprit.gestionfoyerrihabachour.Repositories.SkieurRepo;
import tn.esprit.gestionfoyerrihabachour.entities.Cours;
import tn.esprit.gestionfoyerrihabachour.entities.Inscription;
import tn.esprit.gestionfoyerrihabachour.entities.Piste;
import tn.esprit.gestionfoyerrihabachour.entities.Skieur;
import tn.esprit.gestionfoyerrihabachour.entities.enums.TypeAbonnement;

import java.util.List;
@Builder
@Slf4j
@RequiredArgsConstructor
@Service
public class ISkieurServiceImp implements ISkieurService {

    private final  SkieurRepo skieurRepo;
    private final PisteRepo pisteRepo;
    private final CoursRepo coursRepo;
    private final InscriptionRepo inscriptionRepo;
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
    @Transactional
    @Override
    public Skieur assignSkierToPiste(long numSkieur, long numPiste) {
        Skieur skieur = skieurRepo.findById(numSkieur).orElse(null);
        Piste piste = pisteRepo.findById(numPiste).orElse(null);

        //jebna les pistes l9dom w zedna lil liste jdida
        skieur.getPisteSet().add(piste);
        //les 3 lignes y3awthou ligne eli 9bal
        //Set<Piste> pisteSet = skieur.getPisteSet();
        //pisteSet.add(piste);
        //skieur.setPisteSet(pisteSet);

        //@transactional t3aweth return skieurRepo.save(skieur);
        return skieur;
    }

    @Override
    public Skieur addSkierAndAssignToCourse(Skieur skieur, long numCours) {

    Cours cours =coursRepo.findById(numCours).orElse(null);
        //ajout automatique de abonn
       //verification de abonna
       Assert.notNull(skieur.getAbonnement(),"l'abonnement n'est pas trouvee dans skieur");
       skieurRepo.save(skieur);
       //bech yjibli objet inscription bil geInscriptionset b stream w ken mafamech ywa9ef methode(recuperation d'inscription
       Inscription inscription = skieur.getInscriptionSet().stream().findFirst().orElseThrow( () ->new IllegalArgumentException("skieur must have at least one inscription "));
    //affectation de cours f inscription skieur khtr inscription tgeri les relations zouz
     inscription.setCours(cours);
     inscription.setSkieur(skieur);
     inscriptionRepo.save(inscription);
       return skieur;
   }

    @Override
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {
        return null;
    }

    //Skieur s= Skieur.builder().nomS("rihab").build();
// @Scheduled(fixedRate = 60000)//va lancer lamethode chaque minute
   //pour l'activation de scheduling on doit ajouter @EnableScheduling dans le classe main
    @Scheduled(fixedDelay = 60000)
    public void testSchedule() {
        log.info("Test Schedule");}
@Scheduled(cron = "10000")
public void cron (){}
}
