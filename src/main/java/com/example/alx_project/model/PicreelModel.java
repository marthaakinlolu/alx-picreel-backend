package com.example.alx_project.model;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "picture")
public class PicreelModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    private String image;

}
