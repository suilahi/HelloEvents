package org.helloevent.backend.Repositories;

import org.helloevent.backend.Entity.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EvenementRepository extends JpaRepository<Evenement, Integer> {
}
