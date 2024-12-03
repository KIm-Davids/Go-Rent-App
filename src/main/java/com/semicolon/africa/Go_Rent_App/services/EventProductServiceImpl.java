package com.semicolon.africa.Go_Rent_App.services;

import com.semicolon.africa.Go_Rent_App.dtos.request.EventProductRequest;
import com.semicolon.africa.Go_Rent_App.dtos.response.EventProductResponse;
import com.semicolon.africa.Go_Rent_App.models.EventProduct;
import com.semicolon.africa.Go_Rent_App.repository.EventProductRepo;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EventProductServiceImpl implements EventProductServiceInterface{

    private final ModelMapper modelMapper;
    private final EventProductRepo eventProductRepo;

    public EventProductResponse createEventProduct(EventProductRequest request){
        EventProduct mappedProduct = modelMapper.map(request, EventProduct.class);
        eventProductRepo.save(mappedProduct);
        if(){

        }
        return null;
        }
}
