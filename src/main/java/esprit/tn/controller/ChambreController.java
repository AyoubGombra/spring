package esprit.tn.controller;

import esprit.tn.entities.Bloc;
import esprit.tn.entities.Chambre;
import esprit.tn.entities.TypeChambre;
import esprit.tn.services.IChambreService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "Gestion Chambre")
@RestController
@RequestMapping("/chambre")
public class ChambreController {
    @Autowired
    private IChambreService chambreService;
    @PostMapping("/addChambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        return chambreService.addchambre(c);
    }
    @Operation(description = "récupère tout les chambres de la base de donnée")
    @GetMapping("/findAll")
    List<Chambre> findAll(){
        return chambreService.getAllChambre();
    }
    @PutMapping("/updateChambre")
    Chambre updateChambre (@RequestBody Chambre c){
        return chambreService.updatechambre(c);
    }
    @DeleteMapping("/deleteChambre")
    void deleteChambre (@RequestBody Chambre idChambre){
         chambreService.deleteChambre(idChambre);
    }

    @GetMapping("/findById")
    public Chambre findById(@RequestParam Long id) {
        return chambreService.findByID(id);
    }

    @GetMapping("/findByAllChambre/{tc}")
    List<Chambre> findByChambre (@RequestParam TypeChambre tc) {return chambreService.findAllByTypeChambre(tc);}
    @GetMapping("/findVyNumChambre/{num}")
    public Chambre findByNumeroChambre (@RequestParam Long num) {return chambreService.findByNumeroChambre(num);}

    @GetMapping("/findByAllChambre/{bloc}/{tc}")
    public List<Chambre> findAllBtBlocAndTypeC(@PathVariable("bloc") Bloc bloc, @PathVariable("tc") TypeChambre tc) {return chambreService.getChambreParBlocAndType(bloc,tc);}
}
