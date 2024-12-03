package com.semicolon.africa.Go_Rent_App.services;


import com.semicolon.africa.Go_Rent_App.constants.Consent;
import com.semicolon.africa.Go_Rent_App.dtos.request.EventProductRequest;
import com.semicolon.africa.Go_Rent_App.dtos.request.UserRequest;
import com.semicolon.africa.Go_Rent_App.models.Transaction;
import com.semicolon.africa.Go_Rent_App.models.User;
import com.semicolon.africa.Go_Rent_App.repository.UserRepository;
import lombok.AllArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServicesImpl implements UserServicesInterface{

    private final ModelMapper modelMapper;
    private final UserRepository userRepository;

    public static void getUserConsentResponse(EventProductRequest request){
        if(request.equals(Consent.ACCEPT)){
            Transaction transaction = new Transaction();
            transaction.setProductName(request.getProductName());
//            transaction.s
        }
    }

    private static void findUserId(){

    }

    public User createUser(UserRequest request){
        User newUser = modelMapper.map(request, User.class);
        User savedUser =  userRepository.save(newUser);
        return savedUser;
    }

}
