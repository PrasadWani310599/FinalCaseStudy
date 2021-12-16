package com.example.DealerDetails;

import com.example.DealerDetails.Controller.DealerController;
import com.example.DealerDetails.Repository.DealerRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.stream.Collectors;
import java.util.stream.Stream;


import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest
class DealerDetailsApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private DealerController controller;

	@MockBean
	private DealerRepository repository;


	//This method is for finding all data of dealer
	@Test
	public void findAllDealerTest() {
		when(repository.findAll()).thenReturn(Stream.of
						(new DealerDetails("101","Prasad","Jalgaon",22,"7276934246"),
								new DealerDetails("102","SouLRangeR","Southampton",22,"5464321"))
				.collect(Collectors.toList()));
		assertEquals(2,controller.getDealerDetails().size());
	}

	//this method is for deleting data of dealer by dealer id
	@Test
	public void deleteDealerTest() {
		String dealer_id = "101";
		controller. delete(dealer_id);
		verify(repository,times(1)).deleteById(dealer_id);
	}

	//this method is for getting data of dealer from dealer id
//	@Test
//	public void getDealerDataTest() {
//		String dealer_id = "104";
//		controller. getById(dealer_id);
//		verify(repository,times(1)).findById(dealer_id);
//	}
//	@Test
//	public void addSellerDetailsTest() {
//		DealerDetails dealerDetails = new DealerDetails("101","Amol","Solapur",21,"123654");
//		when(repository.save(dealerDetails)).thenReturn(dealerDetails);
//		assertEquals(dealerDetails, controller.addCrop(dealerDetails));
//
//	}


}

