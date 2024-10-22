package esprit.tn.controller;

import esprit.tn.entities.Chambre;
import esprit.tn.entities.Universite;
import esprit.tn.services.IUniversiteService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/universite")
public class UniversiteController {
    IUniversiteService universiteService;

    @PostMapping("/adduniversite")
    Universite adduniversite (@RequestBody Universite c){
        return universiteService.addUniversite(c);
    }
    @GetMapping("/findAll")
    List<Universite> findAll(){
        return universiteService.getAllUniversite();
    }
    @PutMapping("/updateuniversite")
    Universite updateuniversite (@RequestBody Universite c){
        return universiteService.updateUniversite(c);
    }
    @DeleteMapping("/deleteuniversite")
    void deleteuniversite (@RequestBody Universite iduniversite){
        universiteService.deleteUniversite(iduniversite);
    }

    @GetMapping("/findById")
    Universite findById (@RequestBody Long id) { return universiteService.findByID(id); }
}
