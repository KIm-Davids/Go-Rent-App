package com.semicolon.africa.Go_Rent_App.models;

import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Location {

    private String street;
    private String city;
    private String country;
    @Id
    private Long id;
}
