package esprit.tn.services;

import esprit.tn.entities.Bloc;
import esprit.tn.entities.Chambre;
import esprit.tn.entities.TypeChambre;

import java.util.List;

public interface IChambreService {
    Chambre addchambre (Chambre chambre);
    Chambre updatechambre (Chambre chambre);
    void deleteChambre (Chambre idChambre);
    List<Chambre> getAllChambre ();
    Chambre findByID (Long id);

    List<Chambre> findAllByTypeChambre (TypeChambre tc);

    Chambre findByNumeroChambre (Long numeroChambre);
    List<Chambre> getChambreParBlocAndType (Bloc idBloc, TypeChambre typeC);
}
