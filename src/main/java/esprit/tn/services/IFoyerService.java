package esprit.tn.services;

import esprit.tn.entities.Bloc;
import esprit.tn.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addfoyer (Foyer foyer);
    Foyer updatefoyer (Foyer foyer);
    void deleteFoyer (Foyer idFoyer);
    List<Foyer> getAllFoyer ();
    Foyer findByID (Long id);
}
