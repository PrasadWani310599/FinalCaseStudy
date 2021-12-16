package com.example.Farmer.Controller;

import com.example.Farmer.*;
import com.example.Farmer.Repository.CropRepository;
import com.example.Farmer.Repository.FarmerRepository;
import com.example.Farmer.Repository.UserRepository;
import com.example.Farmer.Utility.JwtUtility;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/farmer")
@EnableEurekaClient
public class FarmerController {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserDetailsService userDetailsService;
    @Autowired
    private JwtUtility jwtUtility;
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private FarmerRepository farmerRepository;

    @GetMapping("/farmerdetails")
    public List<FarmerDetais> getAllDetails()
    {
        return farmerRepository.findAll();
    }

    @PostMapping("/savedetails")
     public String addFarmer(@RequestBody FarmerDetais farmerDetais)
     {
         farmerRepository.save(farmerDetais);
         return "Farmer Details Saved Successfully";
     }
     @GetMapping("/farmerdetails/{f_id}")
     public Optional<FarmerDetais> getFarmerById(@PathVariable ("f_id") String f_id)
     {
         return farmerRepository.findById(f_id);
     }

    @DeleteMapping("/delete/{f_id}")
    public String delete(@PathVariable ("f_id") String f_id)
    {
        farmerRepository.deleteById(f_id);
        return "Farmer deleted successfully";
    }
    @GetMapping("/")
    public String home() {
        return "Welocome Farmer";
    }

    @PostMapping("/signup")
    public String addUser(@RequestBody User user) {
        userRepository.save(user);
        return "Added User :"+user.getUsername();
    }
    @PostMapping("/authenticate")
    public JwtResponse authenticate(@RequestBody FarmerJwtRequest jwtRequest ) throws Exception {
        try {

            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            jwtRequest.getusername(),
                            jwtRequest.getpassword()
                    )
            );
        } catch (BadCredentialsException e) {
            throw new Exception("Invalid Credentials",e);
        }

        final UserDetails userDetails = userDetailsService.loadUserByUsername(jwtRequest.getusername());
        final String token = jwtUtility.generateToken(userDetails);
        return new JwtResponse(token);
    }

     }


