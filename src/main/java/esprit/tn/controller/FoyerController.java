package esprit.tn.controller;

import esprit.tn.entities.Chambre;
import esprit.tn.entities.Etudiant;
import esprit.tn.entities.Foyer;
import esprit.tn.services.IFoyerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foyer")
public class FoyerController {
    IFoyerService foyerService;

    @PostMapping("/addFoyer")
    Foyer addFoyer (@RequestBody Foyer c){
        return foyerService.addfoyer(c);
    }
    @GetMapping("/findAll")
    List<Foyer> findAll(){
        return foyerService.getAllFoyer();
    }
    @PutMapping("/updateFoyer")
    Foyer updateFoyer (@RequestBody Foyer c){
        return foyerService.updatefoyer(c);
    }
    @DeleteMapping("/deleteFoyer")
    void deleteCFoyer (@RequestBody Foyer idFoyer){
        foyerService.deleteFoyer(idFoyer);
    }

    @GetMapping("/findById")
    Foyer findById (@RequestBody Long id) { return foyerService.findByID(id); }
}
