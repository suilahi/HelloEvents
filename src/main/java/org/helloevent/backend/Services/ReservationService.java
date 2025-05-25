package org.helloevent.backend.Services;

import org.helloevent.backend.Entity.Reservation;
import org.helloevent.backend.Repositories.ReservationRepostory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    private ReservationRepostory reservationRepositorye;

    @Autowired
    public ReservationService(ReservationRepostory reservationRepositorye) {
        this .reservationRepositorye = reservationRepositorye;
    }

    public Reservation ajouterReservation(Reservation reservation) {
        return reservationRepositorye.save(reservation);
    }
    public List<Reservation> findAll(){
        return reservationRepositorye.findAll();
    }
}
