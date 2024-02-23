package com.example.coconsult.Services;

import com.example.coconsult.models.Client;

import java.util.List;
import java.util.Optional;

public interface IServiceClient {
    Long ajouterClient(Client client);

    Client modifierClient(Long id, Client newClientData);

    List<Client> getAllClients();

    Client getClient(Long id);

    void removeClient(Long id);
}
