package ru.lember.petfriend.entities.organization;

import lombok.Data;

@Data
public class Address {

    private String country;
    private String city;
    private String street;
    private String floor;
    private String apartament;

    /**
     * door code, tips to find.
     */
    private String additionalAddressInformation;
}
