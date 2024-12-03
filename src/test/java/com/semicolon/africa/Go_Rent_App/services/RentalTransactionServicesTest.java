package com.semicolon.africa.Go_Rent_App.services;

import com.semicolon.africa.Go_Rent_App.constants.Category;
import com.semicolon.africa.Go_Rent_App.dtos.request.EventProductRequest;
import com.semicolon.africa.Go_Rent_App.dtos.response.EventProductResponse;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
public class RentalTransactionServicesTest {

    @Autowired
    private EventProductServiceImpl eventProductService;

    @Test
    public void testThatUserCanAddRental(){
        EventProductRequest request = buildRequest();
        EventProductResponse response = eventProductService.createEventProduct(request);
   }
   private EventProductRequest buildRequest(){
        EventProductRequest product = new EventProductRequest();
        product.setProductName("Photographic Camera");
        product.setProductCategory(Category.MEDIA);
        product.setPrice(BigDecimal.valueOf(10000));
        product.setDescription("I would like to get this camera");
        return product;
    }

}
