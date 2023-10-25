package tn.esprit.gestionfoyerrihabachour.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.gestionfoyerrihabachour.entities.enums.Support;
import tn.esprit.gestionfoyerrihabachour.entities.enums.TypeCours;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Cours {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE) //ignorer la creation du setter pour l'id

    long numCours;
    int niveau;
    float Prix;
    int creneau;
    @Enumerated(EnumType.STRING)
    Support support;
    @Enumerated(EnumType.STRING)
    TypeCours typeCours;
    @OneToMany(mappedBy="cours")//la meme mot que dans la classe inscription
    Set <Inscription> insecriptionSet;


}
