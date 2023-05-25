package com.exam.demo.services;

import com.exam.demo.entities.Clients;
import com.exam.demo.repositories.ClientsRepo;
import com.exam.demo.security.ClientsDetails;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientsDetailsService implements UserDetailsService {
    private final ClientsRepo clientsRepo;

    public ClientsDetailsService(ClientsRepo clientsRepo) {
        this.clientsRepo = clientsRepo;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Clients> clients = clientsRepo.finClientsByName(username);
        if (clients.isEmpty())
            throw new UsernameNotFoundException("Пользователь не найден!");
        return new ClientsDetails(clients.get());
    }
}
