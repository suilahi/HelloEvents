package org.helloevent.backend.Repositories;

import org.helloevent.backend.Entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepostory extends JpaRepository<Reservation,Long> {
}
