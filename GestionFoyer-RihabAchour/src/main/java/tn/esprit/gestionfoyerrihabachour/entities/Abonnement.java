package tn.esprit.gestionfoyerrihabachour.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.gestionfoyerrihabachour.entities.enums.TypeAbonnement;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)
public class Abonnement {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE) //ignorer la creation du setter pour l'id
    long numAbon;
    Date datedebut;
    Date dateFin;
    Float PrixAbon;
    @Enumerated(EnumType.STRING)
    TypeAbonnement typeAbonnement;

}
