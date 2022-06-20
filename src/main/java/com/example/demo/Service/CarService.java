package com.example.demo.Service;

import com.example.demo.Respository.CarRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarService {

    @Autowired
    CarRespository respository;


}
