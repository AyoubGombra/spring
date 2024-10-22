package esprit.tn.controller;

import esprit.tn.entities.Chambre;
import esprit.tn.entities.Reservation;
import esprit.tn.services.IReservationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reservation")
public class ReservationController {
    IReservationService reservationService;

    @PostMapping("/addreservation")
    Reservation addreservation (@RequestBody Reservation c){
        return reservationService.addReservation(c);
    }
    @GetMapping("/findAll")
    List<Reservation> findAll(){
        return reservationService.getAllReservation();
    }
    @PutMapping("/updatereservation")
    Reservation updatereservation (@RequestBody Reservation c){
        return reservationService.updateReservation(c);
    }
    @DeleteMapping("/deletereservation")
    void deletereservation (@RequestBody Reservation idreservation){
        reservationService.deleteReservation(idreservation);
    }

    @GetMapping("/findById")
    Reservation findById (@RequestBody String id) { return reservationService.findByID(id); }
}
