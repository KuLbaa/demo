package com.example.demo.Controller;

import com.example.demo.Reservation;
import com.example.demo.Service.CarService;
import com.example.demo.Service.DriverService;
import com.example.demo.Service.ReceptionistService;
import com.example.demo.Service.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping
public class ReservationController {

    private final ReservationService reservationService;
    private final CarService carService;
    private final DriverService driverService;
    private final ReceptionistService receptionistService;

    @Autowired
    public ReservationController(ReservationService reservationService, CarService carService, DriverService driverService, ReceptionistService receptionistService) {
        this.reservationService = reservationService;
        this.carService = carService;
        this.driverService = driverService;
        this.receptionistService = receptionistService;
    }

    public ResponseEntity<List<Reservation>> get(){
        return ResponseEntity.of(Optional.ofNullable(reservationService.findAll()));
    }
}
