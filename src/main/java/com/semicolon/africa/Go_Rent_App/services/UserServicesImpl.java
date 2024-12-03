package com.semicolon.africa.Go_Rent_App.services;


import com.semicolon.africa.Go_Rent_App.constants.Consent;
import com.semicolon.africa.Go_Rent_App.dtos.request.EventProductRequest;
import com.semicolon.africa.Go_Rent_App.dtos.response.EventProductResponse;
import com.semicolon.africa.Go_Rent_App.dtos.response.UserResponse;
import com.semicolon.africa.Go_Rent_App.models.User;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import static com.fasterxml.jackson.annotation.OptBoolean.TRUE;

@Service
@AllArgsConstructor
public class UserServicesImpl implements UserServicesInterface{

    private final ModelMapper modelMapper;

}
