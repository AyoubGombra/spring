package esprit.tn.controller;

import esprit.tn.entities.Bloc;
import esprit.tn.entities.Chambre;
import esprit.tn.services.IBlocService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Bloc")
public class BlocController {
    IBlocService blocService;
    @PostMapping("/addBloc")
    Bloc addBloc (@RequestBody Bloc c){
        return blocService.addbloc(c);
    }
    @GetMapping("/findAll")
    List<Bloc> findAll(){
        return blocService.getAllBloc();
    }
    @PutMapping("/updateBloc")
    Bloc updateBloc (@RequestBody Bloc c){
        return blocService.updatebloc(c);
    }
    @DeleteMapping("/deleteBloc")
    void deleteBloc (@RequestBody Bloc idBloc){
        blocService.deleteBloc(idBloc);
    }
    @GetMapping("/findById")
    Bloc findById (@PathVariable Long id) { return blocService.findByID(id); }
}
