package com.example.alx_project.service;


import com.example.alx_project.Repository.RegistrationRepository;
import com.example.alx_project.model.RegistrationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    RegistrationRepository registrationRepository;

    public RegistrationModel addData(RegistrationModel request) {
        RegistrationModel user = registrationRepository.save(request);
        return user;
    }
}
