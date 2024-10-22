package esprit.tn.services;

import esprit.tn.entities.Bloc;
import esprit.tn.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite (Universite universite);
    Universite updateUniversite (Universite universite);
    void deleteUniversite (Universite idUniversite);
    List<Universite> getAllUniversite ();
    Universite findByID (Long id);
}
