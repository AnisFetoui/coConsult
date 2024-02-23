package com.example.coconsult.Repository;

import com.example.coconsult.models.Client;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClientRep extends JpaRepository<Client,Long> {

}
