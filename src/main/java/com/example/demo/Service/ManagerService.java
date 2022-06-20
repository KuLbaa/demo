package com.example.demo.Service;

import com.example.demo.Respository.ManagerRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ManagerService {
    @Autowired
    ManagerRespository respository;
}
