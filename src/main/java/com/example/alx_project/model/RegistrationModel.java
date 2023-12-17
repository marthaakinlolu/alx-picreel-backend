package com.example.alx_project.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name= "registration")
public class RegistrationModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private String email;
    private String password;
    private String confirmPassword;
}
