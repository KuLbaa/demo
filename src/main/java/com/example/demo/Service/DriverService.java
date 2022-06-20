package com.example.demo.Service;

import com.example.demo.Respository.DriverRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DriverService {
    @Autowired
    DriverRespository respository;
}
