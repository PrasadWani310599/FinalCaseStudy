package com.example.DealerDetails.Repository;

import com.example.DealerDetails.DealerDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DealerRepository extends MongoRepository<DealerDetails,String> {

}
