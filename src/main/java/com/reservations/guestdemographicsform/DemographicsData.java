package com.reservations.guestdemographicsform;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
public class DemographicsData {
    private String firstName;
    private String lastName;
    private String idNumber;
    private Date  idExpirationDate;
    private String address;
    private String city;
    private String state;
    private String zipcode;
    private String phoneNumber;
    private String email;
    private String loyaltyNumber;

    private States states;
}
