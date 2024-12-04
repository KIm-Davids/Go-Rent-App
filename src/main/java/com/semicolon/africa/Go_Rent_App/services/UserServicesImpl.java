package com.semicolon.africa.Go_Rent_App.services;


import com.semicolon.africa.Go_Rent_App.dtos.request.EventProductRequest;
import com.semicolon.africa.Go_Rent_App.dtos.request.CreateUserRequest;
import com.semicolon.africa.Go_Rent_App.dtos.request.UpdateUserRequest;
import com.semicolon.africa.Go_Rent_App.dtos.response.UpdateUserResponse;
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

    }

    private static void findUserId(){

    }

    public User createUser(CreateUserRequest request){
        User newUser = modelMapper.map(request, User.class);
        User savedUser =  userRepository.save(newUser);
        return savedUser;
    }

    public UpdateUserResponse updateUser(UpdateUserRequest request){
        User foundUser = userRepository.findUserByEmail(request.getEmail());
        User mappedUser = modelMapper.map(foundUser, User.class);
        userRepository.save(mappedUser);
        UpdateUserResponse response = new UpdateUserResponse();
        response.setMessage("User Updated Successfully");
        return response;
    }




}
