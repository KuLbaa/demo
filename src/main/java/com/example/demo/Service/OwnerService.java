package com.example.demo.Service;

import com.example.demo.Respository.OwnerRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerService {
    @Autowired
    OwnerRespository respository;
}
