package org.helloevent.backend.Services;

import org.helloevent.backend.Entity.Evenement;
import org.helloevent.backend.Repositories.EvenementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EvenementService {
    private EvenementRepository repo;

    @Autowired
    public EvenementService(EvenementRepository repo) {
        this.repo = repo;
    }

    public List<Evenement> findAll() {
        return repo.findAll();
    }

    public Evenement create(Evenement e) {
        return repo.save(e);
    }

    public Evenement findById(int id) {
        return repo.findById(id).get();
    }

    public Evenement update(Evenement e) {
        return repo.save(e);
    }

    public void delete(int id) {
        repo.deleteById(id);
    }

    public List<Evenement> findByDate(String date){
        return repo.findByDate(date);
    }
}
