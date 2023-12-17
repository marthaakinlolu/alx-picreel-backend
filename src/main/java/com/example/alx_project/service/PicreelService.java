package com.example.alx_project.service;


import com.example.alx_project.Repository.PicreelModelRepository;
import com.example.alx_project.model.PicreelModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PicreelService {

    @Autowired
    PicreelModelRepository picreelRepository;

    public PicreelModel addPics(PicreelModel requestObject){
        PicreelModel response =  picreelRepository.save(requestObject);
        return response;
    }

    public List<PicreelModel> getPics() {
        return picreelRepository.findAll();
    }

    public void deletePics(long id) {
        picreelRepository.deleteById(id);
    }
}
