package esprit.tn.services;

import esprit.tn.entities.Foyer;
import esprit.tn.reposetry.FoyerRepository;

import java.util.List;

public class FoyerServiceImpl implements IFoyerService{
    FoyerRepository foyerRepository;
    @Override
    public Foyer addfoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public Foyer updatefoyer(Foyer foyer) {
        return foyerRepository.save(foyer);
    }

    @Override
    public void deleteFoyer(Foyer idFoyer) {
        foyerRepository.delete(idFoyer);
    }

    @Override
    public List<Foyer> getAllFoyer() {
        return foyerRepository.findAll();
    }

    @Override
    public Foyer findByID(Long id) {
        return foyerRepository.findById(id).get();
    }
}
