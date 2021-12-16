package com.example.Farmer.Controller;

import com.example.Farmer.CropDetails;
import com.example.Farmer.Repository.CropRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class AnotherFarmerController {
    @Autowired
    private CropRepository cropRepository;

    @PostMapping("/addcrop")
    public String addCrop(@RequestBody CropDetails cropDetails)
    {
        cropRepository.save(cropDetails);
        return "Crop Saved Successfully";
    }
    @DeleteMapping("/deletecrop")
    public String deleteCrop(@PathVariable ("id") String id)
    {
        cropRepository.deleteById(id);
        return  "Crop Deleted Successfully";
    }
}
