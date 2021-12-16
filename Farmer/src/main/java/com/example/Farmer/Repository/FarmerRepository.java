package com.example.Farmer.Repository;

import com.example.Farmer.FarmerDetais;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface FarmerRepository extends MongoRepository<FarmerDetais,String> {


}
