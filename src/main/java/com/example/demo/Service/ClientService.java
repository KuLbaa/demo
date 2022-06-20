package com.example.demo.Service;

import com.example.demo.Client;
import com.example.demo.Respository.ClientRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    ClientRespository respository;

    @Autowired
    public ClientService(ClientRespository clientRepository) {
        this.respository = clientRepository;
    }

    public List<Client> findAll() {
        return respository.findAll();
    }
}
