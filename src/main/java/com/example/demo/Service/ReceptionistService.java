package com.example.demo.Service;

import com.example.demo.Respository.ReservationRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReceptionistService {
    @Autowired
    ReservationRespository respository;
}
