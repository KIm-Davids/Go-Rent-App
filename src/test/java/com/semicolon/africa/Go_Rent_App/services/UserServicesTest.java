package com.semicolon.africa.Go_Rent_App.services;

import com.semicolon.africa.Go_Rent_App.dtos.request.UserRequest;
import com.semicolon.africa.Go_Rent_App.models.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertNotNull;

@SpringBootTest
public class UserServicesTest {

    @Autowired
    private UserServicesImpl userServices;

    @Test
    public void testThatUserCanRegister(){
        UserRequest user = buildUser();
        User createdUser = userServices.createUser(user);
        assertNotNull(createdUser);
    }

    private UserRequest buildUser(){
        UserRequest user = new UserRequest();
        user.setEmail("kim@gmail.com");
        user.setFirstName("Kim");
        user.setLastName("Davids");
        user.setPhoneNumber("09055429111");
        return user;
    }

}
