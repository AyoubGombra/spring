package esprit.tn.services;

import esprit.tn.entities.Chambre;
import esprit.tn.entities.Etudiant;
import esprit.tn.reposetry.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EtudiantServiceImpl implements IEtudiantService{
    EtudiantRepository etudiantRepository;
    @Override
    public Etudiant addetudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantRepository.save(etudiant);
    }

    @Override
    public void deleteEtudiant(Etudiant idetudiant) {
        etudiantRepository.delete(idetudiant);
    }

    @Override
    public List<Etudiant> getAllEtudiant() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant findByID(Long id) {
        return etudiantRepository.findById(id).get();
    }
}
