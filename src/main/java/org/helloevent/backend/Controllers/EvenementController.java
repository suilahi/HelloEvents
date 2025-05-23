package org.helloevent.backend.Controllers;

import jakarta.persistence.Id;
import org.helloevent.backend.Entity.Evenement;
import org.helloevent.backend.Services.EvenementService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.ID;
import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@RestController
@RequestMapping("/evenement")
public class EvenementController {

    private EvenementService evenementService;

    public EvenementController(EvenementService evenementService) {
        this.evenementService = evenementService;
    }

    @PostMapping
    public Evenement ajouterEvenement(@RequestBody Evenement evenement) {
        return evenementService.create(evenement);
    }

    @GetMapping("/Id")
    public List<Evenement> getEvenements() {
        return evenementService.findAll();
    }

    @PutMapping
    public Evenement updateEvenement(@RequestBody Evenement evenement) {
        return evenementService.update(evenement);
    }

    @DeleteMapping("/{Id}")
    public Evenement deleteEvenement(@RequestBody int Id) {
        return evenementService.findById(Id);
    }
}
