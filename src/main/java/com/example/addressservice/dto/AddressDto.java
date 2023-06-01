package com.example.addressservice.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class AddressDto {

    private Long id;

    private String street;

    private String addressLine1;
    private String addressLine2;

    private Integer zipCode;

    private String state;

    private String houseNo;

    private String flatNo;

    private String country;

    private String sector;

    private String landmark;
}
