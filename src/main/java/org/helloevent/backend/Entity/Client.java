package org.helloevent.backend.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import java.util.List;

@Entity
public class Client extends User{

    @OneToMany(mappedBy = "client")
    private List<Reservation> reservations;

}
