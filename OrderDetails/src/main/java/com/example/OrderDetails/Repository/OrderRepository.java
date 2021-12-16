package com.example.OrderDetails.Repository;

import com.example.OrderDetails.OrderDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<OrderDetails,String > {

}
