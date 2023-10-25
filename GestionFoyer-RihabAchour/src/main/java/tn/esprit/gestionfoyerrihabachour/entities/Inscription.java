package tn.esprit.gestionfoyerrihabachour.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
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
public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE) //ignorer la creation du setter pour l'id
    long numInscription;
    int numSemaine;
    @ManyToOne
    Cours cours;
    @ManyToOne
    tn.esprit.gestionfoyerrihabachour.entities.Skieur Skieur;
}