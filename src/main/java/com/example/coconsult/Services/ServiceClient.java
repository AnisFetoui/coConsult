package com.example.coconsult.Services;

import com.example.coconsult.Repository.ClientRep;
import com.example.coconsult.models.Client;
import jakarta.persistence.EntityNotFoundException;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Slf4j
@AllArgsConstructor
public class ServiceClient implements IServiceClient{

    @Autowired
    ClientRep clientRep;

    @Override
    public Long ajouterClient(Client c){return clientRep.save(c).getIdClient();}

    @Override
    public Client modifierClient(Long id, Client newClientData) {
        Optional<Client> client = clientRep.findById(id);

        if (client.isPresent()) {
            Client existingClient = client.get();

            existingClient.setNom(newClientData.getNom());
            existingClient.setEmail(newClientData.getEmail());
            existingClient.setPhone(newClientData.getPhone());
            existingClient.setCompanyAddress(newClientData.getCompanyAddress());

            return clientRep.save(existingClient);
        } else {
            throw new EntityNotFoundException("Client with ID " + id + " not found");
        }
    }
    @Override
    public List<Client> getAllClients() {
        return clientRep.findAll();
    }
    @Override
    public Client getClient(Long id){
        Client client = clientRep.findById(id).orElse(null);
        return client;
    }
    @Override
    public void removeClient(Long id) {
        Client client = clientRep.findById(id).orElse(null);
        clientRep.deleteById(id);

    }

}
