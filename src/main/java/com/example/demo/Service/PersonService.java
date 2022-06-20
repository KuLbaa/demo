package com.example.demo.Service;

import com.example.demo.Respository.PersonRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService{
    @Autowired
    PersonRespository respository;


}
