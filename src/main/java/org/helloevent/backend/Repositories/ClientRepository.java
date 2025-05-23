package org.helloevent.backend.Repositories;

import org.helloevent.backend.Entity.Client;
import org.helloevent.backend.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Long> {
    Client findByEmail(String email);

}
