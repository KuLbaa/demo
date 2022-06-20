package com.example.demo.Controller;


import com.example.demo.Client;
import com.example.demo.Service.ClientService;
import com.example.demo.Service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clients")
public class ClientController {

    private final ClientService clientService;
    private final ReservationService reservationService;

    @Autowired
    public ClientController(ClientService clientService, ReservationService reservationService) {
        this.clientService = clientService;
        this.reservationService = reservationService;
    }

    @GetMapping
    public ResponseEntity<List<Client>> get() {
        return ResponseEntity.of(Optional.ofNullable(clientService.findAll()));
    }
}
