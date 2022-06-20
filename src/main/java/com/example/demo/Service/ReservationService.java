package com.example.demo.Service;

import com.example.demo.Client;
import com.example.demo.Reservation;
import com.example.demo.Respository.ReservationRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {
    @Autowired
    ReservationRespository respository;

    @Autowired
    public ReservationService(ReservationRespository respository) {
        this.respository = respository;
    }

    public List<Reservation> findAll() {
        return respository.findAll();
    }
}
