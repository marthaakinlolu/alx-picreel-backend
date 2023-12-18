package com.example.alx_project.controller;


import com.example.alx_project.model.PicreelModel;
import com.example.alx_project.service.PicreelService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PicreelController {

    @Autowired
    PicreelService picreelService;


    @PostMapping("/postPicreel")
    public PicreelModel addPics(@RequestBody PicreelModel request) {
        return picreelService.addPics(request);
    }

    @GetMapping("/getPicreel")
    public List<PicreelModel> getPics() {
        return picreelService.getPics();
    }

    @DeleteMapping("/deletePics")
    public void deletePics(@RequestParam long id) {
        picreelService.deletePics(id);
    }

    @PutMapping ("/updatePicreel")
    public String updatePics(@RequestBody PicreelModel updatedPicreelModel) {
        boolean updated = picreelService.updatePics(updatedPicreelModel);

        if (updated) {
            return "Picture updated successfully";
        } else {
            return "Picture not Found";
        }
    }

}



