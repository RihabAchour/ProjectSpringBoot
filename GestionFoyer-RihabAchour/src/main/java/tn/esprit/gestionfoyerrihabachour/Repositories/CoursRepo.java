package tn.esprit.gestionfoyerrihabachour.Repositories;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import tn.esprit.gestionfoyerrihabachour.entities.Cours;

import java.util.List;
public interface CoursRepo extends CrudRepository<Cours,Long> {
 //nativequery

    @Query(
            value = "SELECT * " +
            "FROM cours c" +
            "JOIN moniteur_cours mc on c.num_cours=mc.cours_num_cours" +
            "JOIN moniteur m on m.id=mc.moniteur_id" +
            "WHERE m.nomm=?1 and m.prenomm=?2", nativeQuery = true)
List <Cours> findByMoniteurNomM(String nomM , String prenom );


///JPQl
    @Query(
             "SELECT c" +
                    " FROM Cours c" +
                    " JOIN Moniteur m on c member m.cours " +
                    "WHERE m.nomM=?1 and m.prenomM= :prenomM")
    List <Cours> findByMoniteurNomMJPQL(String nomM , @Param("prenomM")String prenom );

}
