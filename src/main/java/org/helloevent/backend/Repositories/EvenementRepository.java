package org.helloevent.backend.Repositories;

import org.helloevent.backend.Entity.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EvenementRepository extends JpaRepository<Evenement, Integer> {
    List<Evenement> findByDate(String date);

}
