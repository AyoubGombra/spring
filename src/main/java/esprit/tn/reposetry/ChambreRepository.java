package esprit.tn.reposetry;

import esprit.tn.entities.Bloc;
import esprit.tn.entities.Chambre;
import esprit.tn.entities.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.sql.Blob;
import java.util.List;

@Repository
public interface ChambreRepository extends JpaRepository <Chambre, Long> {
    List<Chambre> findAllBytypeC (TypeChambre tc);

    Chambre findBynumeroChambre (Long numeroChambre);
    List<Chambre>  getChambreBytypeCAndBloc (Bloc idBloc, TypeChambre typeC) ;


}
