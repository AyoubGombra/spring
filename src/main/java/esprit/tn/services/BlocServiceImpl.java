package esprit.tn.services;

import esprit.tn.entities.Bloc;
import esprit.tn.reposetry.BlocRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BlocServiceImpl implements IBlocService{
    BlocRepository blocRepository;
    @Override
    public Bloc addbloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public Bloc updatebloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void deleteBloc(Bloc idbloc) {
        blocRepository.delete(idbloc);
    }

    @Override
    public void deleteBlocByID(Long id) {
        blocRepository.deleteById(id);
    }

    @Override
    public List<Bloc> getAllBloc() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc findByID(Long id) {
        return blocRepository.findById(id).get();
    }
}
