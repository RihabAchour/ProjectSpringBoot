package tn.esprit.gestionfoyerrihabachour.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import java.util.Date;
import java.util.Set;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Skieur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE) //ignorer la creation du setter pour l'id
    long numSkieur;
    String nomS;
    String prenomS;
    Date dateNaissance;
    String Ville;
    @ManyToMany(cascade = CascadeType.ALL)
    Set<Piste> pisteSet;

    @OneToMany(mappedBy="Skieur")//la meme mot que dans la classe inscription
    Set <Inscription> inscriptionSet;
    @OneToOne(cascade = CascadeType.ALL)
    Abonnement abonnement ;




}
