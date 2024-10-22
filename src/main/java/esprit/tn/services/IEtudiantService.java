package esprit.tn.services;

import esprit.tn.entities.Bloc;
import esprit.tn.entities.Chambre;
import esprit.tn.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addetudiant (Etudiant etudiant);
    Etudiant updateEtudiant (Etudiant etudiant);
    void deleteEtudiant (Etudiant idetudiant);
    List<Etudiant> getAllEtudiant ();
    Etudiant findByID (Long id);
}
