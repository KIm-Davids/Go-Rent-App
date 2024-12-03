package com.semicolon.africa.Go_Rent_App.models;

import com.semicolon.africa.Go_Rent_App.constants.Consent;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class User {

    @Id
    private Long id;
    @OneToMany
    private List<RentalTransaction> transaction;
    private Consent userConsent;
    private Location address;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    @OneToMany
    private List<EventProduct> product;
}
