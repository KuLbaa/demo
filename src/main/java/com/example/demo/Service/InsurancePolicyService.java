package com.example.demo.Service;

import com.example.demo.Respository.InsurancePolicyRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsurancePolicyService {
    @Autowired
    InsurancePolicyRespository respository;
}
