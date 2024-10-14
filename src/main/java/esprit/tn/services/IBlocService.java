package esprit.tn.services;

import esprit.tn.entities.Bloc;
import esprit.tn.entities.Chambre;

import java.util.List;

public interface IBlocService {
    Bloc addbloc (Bloc bloc);
    Bloc updatebloc (Bloc bloc);
    void deleteBloc (Long idbloc);
    List<Bloc> getAllBloc ();
    Bloc findByID (Long id);
}
