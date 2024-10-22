package esprit.tn.services;

import esprit.tn.entities.Reservation;
import esprit.tn.reposetry.ReservationRepository;

import java.util.List;

public class ReservationServiceImp implements IReservationService{
    ReservationRepository reservationRepository;
    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(Reservation idReservation) {
        reservationRepository.delete(idReservation);
    }

    @Override
    public List<Reservation> getAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation findByID(String id) {
        return reservationRepository.findById(id).get();
    }
}
