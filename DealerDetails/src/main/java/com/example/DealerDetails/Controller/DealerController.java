package com.example.DealerDetails.Controller;

import com.example.DealerDetails.CropDetails;
import com.example.DealerDetails.DealerDetails;
import com.example.DealerDetails.Repository.DealerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
@RequestMapping("/dealer")
@RestController
public class DealerController {
    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private DealerRepository dealerRepository;

    @GetMapping("/getdealer")
    public List<DealerDetails> getDealerDetails()
    {
        return dealerRepository.findAll();
    }

    @PostMapping("/savedealer")
    public String addCrop(@RequestBody DealerDetails dealerDetails ) {
        dealerRepository.save(dealerDetails);
        return "Dealer Details Added Successfully";
    }
    @DeleteMapping("/delete/{dealer_id}")
    public String delete(@PathVariable ("dealer_id") String dealer_id)
    {
        dealerRepository.deleteById(dealer_id);
        return "Dealer deleted successfully";
    }

    @GetMapping("/getdetails/{dealer_id}")
    public Optional<DealerDetails> getById(@PathVariable ("dealer_id") String dealer_id)
    {
        return dealerRepository.findById(dealer_id);
    }

    @GetMapping("/getcroplist")
    public List<CropDetails> getCropList()
    {
        CropDetails[] list= restTemplate.getForObject("http://localhost:8086/findallcrop",CropDetails[].class);
        return Arrays.asList(list);
    }
}
