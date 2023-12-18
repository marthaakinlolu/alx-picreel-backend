package com.example.alx_project.controller;

import com.example.alx_project.model.RegistrationModel;
import com.example.alx_project.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("register")
public class RegistrationController {
    private final RegistrationService registrationService;

    @Autowired
    public RegistrationController(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    @PostMapping("/user")
    public String addData(@RequestBody RegistrationModel request) {

        return registrationService.addData(request);
    }

    @PostMapping("/login")
    public String login(@RequestBody RegistrationModel request) {

        boolean isAuthenticated = registrationService.authenticate(request.getEmail(), request.getPassword());

        if (isAuthenticated) {
            return "Login Successful";
        } else {
            return "Invalid Credentials";
        }

    }
}
