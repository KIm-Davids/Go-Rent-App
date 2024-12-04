package com.semicolon.africa.Go_Rent_App.services;

import com.semicolon.africa.Go_Rent_App.dtos.request.EventProductRequest;
import com.semicolon.africa.Go_Rent_App.dtos.request.UpdateProductRequest;
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

    public EventProduct createEventProduct(EventProductRequest request){
        EventProduct mappedProduct = modelMapper.map(request, EventProduct.class);
        return eventProductRepo.save(mappedProduct);
        }

    public EventProduct updateEventProduct(UpdateProductRequest request){
                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
    }
}
