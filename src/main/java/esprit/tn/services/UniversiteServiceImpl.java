package esprit.tn.services;

import esprit.tn.entities.Universite;
import esprit.tn.reposetry.UniversiteRepository;

import java.util.List;

public class UniversiteServiceImpl implements IUniversiteService{
    UniversiteRepository universiteRepository;
    @Override
    public Universite addUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public Universite updateUniversite(Universite universite) {
        return universiteRepository.save(universite);
    }

    @Override
    public void deleteUniversite(Universite idUniversite) {
        universiteRepository.delete(idUniversite);
    }

    @Override
    public List<Universite> getAllUniversite() {
        return universiteRepository.findAll();
    }

    @Override
    public Universite findByID(Long id) {
        return universiteRepository.findById(id).get();
    }
}
