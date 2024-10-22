package esprit.tn.services;

import esprit.tn.entities.Bloc;
import esprit.tn.entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation (Reservation reservation);
    Reservation updateReservation (Reservation reservation);
    void deleteReservation (Reservation idReservation);
    List<Reservation> getAllReservation ();
    Reservation findByID (String id);
}
