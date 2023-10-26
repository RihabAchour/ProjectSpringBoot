package tn.esprit.gestionfoyerrihabachour.entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import tn.esprit.gestionfoyerrihabachour.entities.enums.TypeCours;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.util.Date;
import java.util.Set;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level= AccessLevel.PRIVATE)//tous les attributs sont private
public class Moniteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE) //ignorer la creation du setter pour l'id
    long numMoniteur ;
    String nomM;
    String prenomM;
    Date dateRecu;
    @Enumerated(EnumType.STRING)
    TypeCours typeCours;
    @OneToMany(cascade = CascadeType.ALL)
    Set <Cours> cours;


}
