package com.exam.demo.repositories;

import com.exam.demo.entities.Clients;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ClientsRepo extends JpaRepository<Clients, Long> {
    Optional<Clients> finClientsByName (String contain);

    Optional<Clients> findClientByName(String name);
}
