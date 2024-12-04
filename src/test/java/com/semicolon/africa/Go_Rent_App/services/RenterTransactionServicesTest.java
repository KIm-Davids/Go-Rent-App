package com.semicolon.africa.Go_Rent_App.services;

import com.semicolon.africa.Go_Rent_App.constants.Category;
import com.semicolon.africa.Go_Rent_App.dtos.request.EventProductRequest;
import com.semicolon.africa.Go_Rent_App.models.EventProduct;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.Assert.assertNotNull;

@SpringBootTest
public class RenterTransactionServicesTest {

    @Autowired
    private EventProductServiceImpl eventProductService;

    @Test
    public void testThatUserCanAddProduct(){
        EventProductRequest request = buildRequest();
        EventProduct response = eventProductService.createEventProduct(request);
        assertNotNull(response);
   }

   @Test
   public void testTHatUserCanUpdateProduct(){
        EventProductRequest request = buildUpdateRequest();
        EventProduct product = eventProductService.
   }

   private EventProductRequest buildRequest(){
        EventProductRequest product = new EventProductRequest();
//        product.setUserId(1L);
        product.setProductName("Photographic Camera");
        product.setProductCategory(Category.MEDIA);
        product.setPrice(BigDecimal.valueOf(10000));
        product.setDescription("New Camera for sale");
        return product;
    }

//    private UpdateProductRequest updateProductRequest(){
//
//    }

}
