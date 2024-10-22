package esprit.tn.controller;

import esprit.tn.entities.Chambre;
import esprit.tn.entities.Etudiant;
import esprit.tn.services.IEtudiantService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
public class EtudiantController {
    IEtudiantService etudiantService;

    @PostMapping("/addEtudiant")
    Etudiant addEtudiant (@RequestBody Etudiant c){
        return etudiantService.addetudiant(c);
    }
    @GetMapping("/findAll")
    List<Etudiant> findAll(){
        return etudiantService.getAllEtudiant();
    }
    @PutMapping("/updateEtudiant")
    Etudiant updateEtudiant (@RequestBody Etudiant c){
        return etudiantService.updateEtudiant(c);
    }
    @DeleteMapping("/deleteChambre")
    void deleteEtudiant (@RequestBody Etudiant idEtudiant){
        etudiantService.deleteEtudiant(idEtudiant);
    }

    @GetMapping("/findById")
    Etudiant findById (Long id) { return etudiantService.findByID(id); }
}
