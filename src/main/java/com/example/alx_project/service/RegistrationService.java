package com.example.alx_project.service;


import com.example.alx_project.Repository.RegistrationRepository;
import com.example.alx_project.model.RegistrationModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    private final RegistrationRepository registrationRepository;

    @Autowired
    public RegistrationService(RegistrationRepository registrationRepository) {
        this.registrationRepository = registrationRepository;
    }

    public RegistrationModel addData(RegistrationModel request) {
        return registrationRepository.save(request);
    }

    public RegistrationModel findByEmail(String email) {
        return registrationRepository.findByEmail(email);
    }

    public boolean authenticate(String email, String password) {
        RegistrationModel user = registrationRepository.findByEmail(email);

        return user != null && password.equals(user.getPassword());
    }
}
