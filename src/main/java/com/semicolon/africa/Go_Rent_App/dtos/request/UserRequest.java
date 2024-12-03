package com.semicolon.africa.Go_Rent_App.dtos.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UserRequest {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
}
