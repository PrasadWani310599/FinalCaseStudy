package com.example.Farmer.Repository;

import com.example.Farmer.CropDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CropRepository extends MongoRepository<CropDetails,String > {

}
