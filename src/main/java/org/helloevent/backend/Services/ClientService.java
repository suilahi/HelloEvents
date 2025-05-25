package org.helloevent.backend.Services;
import org.helloevent.backend.Entity.Client;
import org.helloevent.backend.Entity.Evenement;
import org.helloevent.backend.Repositories.ClientRepository;
import org.helloevent.backend.Repositories.EvenementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClientService {
    private final ClientRepository clientRepository;

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public List<Client> getAllClients() {
        return clientRepository.findAll();
    }

    public void deleteClient(long id) {
        clientRepository.deleteById(id);
    }

    public Client updateClients( Client clients) {
        return clientRepository.save(clients);
    }
}
